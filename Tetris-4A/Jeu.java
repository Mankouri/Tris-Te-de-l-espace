import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Vector;

/**
 * Noyau de Tetris.
 * Gere le deplacement des pieces, les tests de
 * collision, etc...
 * @author Ange FOFE, Jalil MANKOURI & Andy Harvel
 * @version $Revision: 1.0 $
 */
 
public class Jeu {
	/** Socket de communication avec le 2eme joueur. */
	private Socket socket;
	/** Flux de lecture venant du 2me joueur. */
	private DataInputStream in;
	/** Flux d'Ecriture avec le 2eme joueur. */
	private DataOutputStream out;
	/** Largeur en colonnes du jeu  */
	private int width;
	/** Hauteur en lignes du jeu*/
	private int height;
	/** Matrice du jeu. */
	private int mat[][];
	/** Piece en cours de deplacement. */
	private Piece enCours;
	/** Piece a venir. */
	private Piece suivante;
	/** Score du jeu. */
	private int score;
	/** Nombre de lignes total effectuees pendant la partie. */
	private int ligne;
	/** Nombre de lignes relatif au niveau effectuees pendant la partie. */
	private int ligneNiveau;
	/** Niveau en cours. */
	private int niveau;
	/** Canvas sur l'affichage de la piece suivante. */
	private CanvasPieceSuivante cps;
	/** Vecteur de matrice definissant les pieces creees par l'utilisateur. */
	private Vector<Matrix> userMatrix;
/**
 * Constructeur du jeu: On initialise les parametres.
 * @param width Largeur de la matrice du jeu (12, normalement).
 * @param height Hauteur de la matrice du jeu (20, normalement).
 * @param cps Canvas sur la piece suivante.
 */

public Jeu(int width, int height, CanvasPieceSuivante cps) {
	/* Affectation des parametres de la matrice. */
	this.width = width;
	this.height = height;
	this.cps = cps;
	/* Aucune piece utilisateur n'est stockee au debut. */
	userMatrix = new Vector<Matrix>();
	mat = new int[width][height];
	/* Initialisation de la matrice a -1 (pas de piece stockee). */
	for (int i=0; i<width; i++) {
		for (int j=0; j<height; j++) {
			mat[i][j] = -1;
		}
	}
	
	enCours = null;
	suivante = null;
	/* On determine la premiere piece envoyee. */
	nextPiece();
	/* On determine la piece qui suivra. */
	nextPiece();
	/* On initialise les variables du jeu. */
	score = 0;
	ligne = 0;
	ligneNiveau = 0;
	niveau = 1;
}
/**
 * Ajoute une piece dans la matrice du jeu. Cette piece perd son identite dans la
 * matrice.
 * @param piece Piece a ajouter.
 */

private void addPiece2Jeu(Piece piece) {
	int pieceX = piece.getPosX() - piece.getSize() / 2;
	int pieceY = piece.getPosY() - piece.getSize() / 2;

	/* Ajoute chacun des carres de la piece a inserer dans la table du jeu. */
	for (int x = 0; x < piece.getSize(); x++) {
		for (int y = 0; y < piece.getSize(); y++) {
			if ((pieceX + x < width) && (pieceY + y < height) && (piece.getVal(x, y) != -1)) {
				mat[pieceX + x][pieceY + y] = piece.getVal(x, y);
			}
		}
	}
}
/**
 * Ajoute une piece utilisateur.
 * @param mat Matrice de la piece utilisateur.
 */
public void addUserPiece(Matrix mat) {
	userMatrix.addElement(mat);
}
/**
 * Dessine la matrice du jeu dans le canvas.
 * @param g Zone graphique courante de trace
 */
  
public void draw(Graphics g) {
	enCours.draw(g);
	
	/* Trace de chacun des carres avec leur couleur respective. */
	for (int x = 0; x < width; x++) {
		for (int y = 0; y < height; y++) {
			if (mat[x][y] != -1) {
				(new BlocGraphique(Couleur.getCouleur(mat[x][y]), x, y)).draw(g);
			}
		}
	}
}
/**
  * Efface une ligne de la matrice du jeu (quand une ligne est complete).
  * @param numLine Numero de la ligne a effacer.
  */

private void dropLine(int numLine) {
	/* On decale toutes les lignes haut dessus de la ligne a eliminer. */
	for (int y = numLine; y > 0; y--) {
		for (int x = 0; x < width; x++) {
			mat[x][y] = mat[x][y - 1];
		}
	}
}
/**
 * Retourne le nombre de lignes effectuees depuis le debut de la partie..

 * @return Le nombre de lignes effectuees. */
public int getLigne() {
	return ligne;
}
/**
 * Retourne le niveau en cours.

 * @return Numero du niveau en cours */
public int getNiveau() {
	return niveau;
}
/**
 * Retourne la valeur du score de la partie.

 * @return La valeur du score de la partie. */
public int getScore() {
	return score;
}
/**
 * Retourne la piece suivante de la partie.

 * @return La piece suivante. */
public Piece getSuivante() {
	return suivante;
}
/**
 * Teste et retourne si la position de la piece en mouvement dans la partie se
 * trouve a une position correcte dans la matrice du jeu.

 * @param piece Piece
 * @return true si la position est valide ; false sinon. */
public boolean isPositionPossible(Piece piece) {
	int pieceX = piece.getPosX() - piece.getSize() / 2;
	int pieceY = piece.getPosY() - piece.getSize() / 2;

	/* On verifie que chacun des carres de la piece sont dans le cadre */
	/* du jeu et qu'ils ne chevauchent pas une autre piece du jeu. */
	for (int x = 0; x < piece.getSize(); x++) {
		for (int y = 0; y < piece.getSize(); y++) {
			if ((piece.getVal(x, y) != -1) && // La piece existe ici.
				((pieceX + x < 0) || (pieceX + x >= width) || (pieceY + y < 0) || (pieceY + y >= height) || // On est dans le cadre.
				(mat[pieceX + x][pieceY + y] != -1))) { // Il n'a pas deja une piece 
				return false;
			}
		}
	}
	return true;
}
/**
 * Calcule est stocke la piece suivante de la partie. La piece suivante precedente
 * devient la piece en cours.
 */
private void nextPiece() {
	enCours = suivante;
	// On choisi une piece au hasard parmi les modeles:
	int numTypePiece = (int) (Math.random() * (7 + userMatrix.size()));
	switch (numTypePiece) {
		case 0 :
			suivante = new PieceEnFormeDeCarre((int) (Math.random() * (width - 4) + 2), 2);
			break;
		case 1 :
			suivante = new PieceEnFormeDeElle((int) (Math.random() * (width - 4) + 2), 2);
			break;
		case 2 :
			suivante = new PieceEnFormeDeEsse((int) (Math.random() * (width - 4) + 2), 2);
			break;
		case 3 :
			suivante = new PieceEnFormeDeBarre((int) (Math.random() * (width - 4) + 2), 2);
			break;
		case 4 :
			suivante = new PieceEnFormeDeTe((int) (Math.random() * (width - 4) + 2), 2);
			break;
		case 5 :
			suivante = new PieceEnFormeDeEsseInverse((int) (Math.random() * (width - 4) + 2), 2);
			break;
		case 6 :
			suivante = new PieceEnFormeDeElleInverse((int) (Math.random() * (width - 4) + 2), 2);
			break;
		default :
			Matrix mat = (Matrix) userMatrix.elementAt(numTypePiece - 7);
			suivante = new UserPiece((int) (Math.random() * (width - mat.getSize()) + (mat.getSize() + 1) / 2), (mat.getSize() + 1) / 2, mat);
			break;
	}
	cps.setPiece(suivante);
}
/**
 * Reinitialise la partie.
 */
public void nouveauJeu() {
	for (int j = 0; j < height; j++) {
		for (int i = 0; i < width; i++) {
			mat[i][j] = -1;
		}
	}

	enCours = null;
	suivante = null;
	/* On determine la premiere piece envoyee. */
	nextPiece();
	/* On determine la piece qui suivra. */
	nextPiece();

	this.score = 0;
	this.ligne = 0;
}
/**
 * Methode principale du noyau. Gere l'evolution de la partie en cours.

 * @return true si tout c'est bien passe ; false si la partie est terminee. */

public boolean play() {
	if (socket != null) {
		int handicap;
		try {
			if (in.available() > 0) {
				handicap = in.read();
				switch (handicap) {
					case 0 :
						setSocket(null, false);
						new JFrameMsg("Ev�nement reseau", " Le joueur n�2 a abandonn� la partie !");
						break;
					case 1 :
						setSocket(null, false);
						new JFrameMsg("WAHOOO!", "Bravo !! Vous avez vaincu votre adversaire !");
						break;
					default :
						setHandicap(handicap);
						break;
				}
			}
		} catch (IOException e) {
		}
	}
	// On fait descendre la piece a chaque tour:
	enCours.down();

	// Si la piece ne peut plus descendre -> on passe a une nouvelle:
	if (!isPositionPossible(enCours)) {
		// Son d'arrivee en bas:
		enCours.up();
		// On rajoute la piece arrivee a la table du jeu:
		addPiece2Jeu(enCours);
		// On verifie s'il une ou plusieurs lignes sont completees:
		int nbLine = verifieLine();
		if (nbLine == 0) { // Pas de nouvelle ligne construite.
			score += 10;
		} else { //On a cree de nouvelle(s) ligne(s).
			if ((socket != null) && (nbLine > 1)) {
				try {
					out.write(nbLine);
				} catch (IOException e) {
				}
			}
			ligneNiveau += nbLine; // le nombre de ligne dans le niveau.
			score += 100 * (int) Math.pow((double) 2, (double) (nbLine - 1));
			ligne += nbLine; // Le nombre de ligne total.
			if (ligneNiveau >= 10) { // On passe au niveau suivant.
				niveau++;
				ligneNiveau -= 10;
			}
		}
		// On passe a la piece suivante:
		nextPiece();
		// Si la nouvelle piece ne peut plus rentrer -> On a perdu!:
		if (!isPositionPossible(enCours)) {
			if (socket != null) {
				try {
					out.write(1);
				} catch (IOException e) {
				}
				setSocket(null, false);
			}
			return false;
		}
	}
	return true;
}
/**
 * Genere un handicap dans le jeu.
 * @param nbRangees Nombre de lignes d'handicap a ajouter
 */
public void setHandicap(int nbRangees) {
	/* Decale toutes les lignes vers de nbRangees. */
	for (int j = 0; j <= height - 1 - nbRangees; j++) {
		for (int i = 0; i < width; i++) {
			mat[i][j] = mat[i][j + nbRangees];
		}
	}
	/* Ajoute aleatoirement des carres pour chacune des lignes. */
	for (int j = height - nbRangees; j < height; j++) {
		for (int i = 0; i < width; i++) {
			int couleur = (int) (Math.random() * Couleur.getSize() * 2 - 1);
			if (couleur < Couleur.getSize()) {
				mat[i][j] = couleur;
			} else {
				mat[i][j] = -1;
			}
		}
	}
}
/**
 * Change le niveau de la partie en cours.
 * @param niveau Nouveau niveau de la partie
 */
public void setNiveau(int niveau) {
	this.niveau = niveau;
}
/**
 * Affecte le socket de communication et cree les flux d'entree et de sortie.
Si celui-ci est null, la communication avec le deuxi�me joueur n'est pas 
 * ou plus consideree.
 * @param socket Socket de communication
 * @param prevenirLAutre Booleen dans le cas ou l'on veut envoyer -1 (fin de partie)
 * avant de fermer pour prevenir l'autre joueur que l'on va stopper la communication.
 */
public void setSocket(Socket socket, boolean prevenirLAutre) {
	/* Si le socket n'est pas null, le mode 2 joueurs est enclenche. */
	if (socket != null) {
		/* On essaye de creer le flux d'entree. */
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			try {
				socket.close();
			} catch (IOException e2) {
			}
			socket = null;
		}
		/* On essaye de creer le flux de sortie. */
		try {
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			try {
				socket.close();
			} catch (IOException e2) {
			}
			socket = null;
		}
	} else {
		/* Si le socket est null et qu'il ne l'etait pas avant, on ferme les flux */
		/* et la connexion precedents. */
		if (this.socket != null) {
			try {
				if (prevenirLAutre) {
					out.write(0);
				}
				in.close();
				out.close();
				this.socket.close();
			} catch (IOException e) {
			}
		}
	}
	/* On affecte le nouveau socket. */
	this.socket = socket;
}
/**
 * Teste l'appui des touches de direction de manipulation de la piece en cours
 * d'evolution.
 * @param code Code de la touche passe par le KeyListener.
 */
public void testKey(int code) {
	switch (code) {
		case 0x25 : // Touche [fleche gauche]:
			enCours.translation(false);
			if (!isPositionPossible(enCours)) {
				enCours.translation(true);
			}
			break;
		case 0x27 : // Touche [fleche droite]:
			enCours.translation(true);
			if (!isPositionPossible(enCours)) {
				enCours.translation(false);
			}
			break;
		case 0x28 : // Touche [fleche bas]:
			enCours.down();
			if (!isPositionPossible(enCours)) {
				enCours.up();
			}
			break;
		case 0x26 : // Touche [fleche haut]:
			enCours.rotation(true);
			if (!isPositionPossible(enCours)) {
				enCours.rotation(false);
			}
			break;
	}
}
/**
 * Teste si le score est une des meilleurs performances.
 */
public void testScore() {
	new FrameBestScore(score, niveau, ligne); // On affiche les meilleurs score.
}
/**
 * Teste toutes les lignes de la matrice du jeu et supprimes toutes celles qui
 * sont completes.

 * @return Retourne le nombre de lignes effacees. */
public int verifieLine() {
	int retour = 0;
	/* Pour chacune des lignes de la table du jeu. */
	for (int y = 0; y < height; y++) {
		/* On quitte la boucle interne s'il y a un trou. */
		int x;
		for (x = 0; x < width; x++) {
			if (mat[x][y] == -1) {
				break;
			}
		}
		/* S'il y'a pas eu de trou alors x = 10 -> on efface la ligne. */
		if (x == width) {
			retour++;
			dropLine(y);
			y--;
		}
	}
	/* On retourne le nombre de lignes effacees. */
	return retour;
}
}