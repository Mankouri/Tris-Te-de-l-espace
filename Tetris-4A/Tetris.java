import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * Lancement du jeu.
 * Programme executable.
 * Gestion de la fenetre principale du jeu Tetris.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */ 
public class Tetris extends JFrame implements KeyListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6727674950505709582L;
	/** Barre de menu de la frame. */
	private BarreDuMenu barreMenu;
	/** Label "Piece suivante" */
    private JLabel labelApercu;
	/** Label de score. */
    private JLabel labelScore;
	/** Label du niveau. */
	private JLabel labelLevel;
	/** Label du nombre de ligne. */
	private JLabel labelLigne;
	/** Canvas de jeu. */
	private MonCanvas canvas;
	/** Canvas de la piece suivante. */
	private CanvasPieceSuivante cps;
/**
 * Constructeur de la Frame. 
 */
@SuppressWarnings("deprecation")
public Tetris() {
	super();
	setTitle("Tetris by Ange FOFE, Jalil MANKOURI & Andy HARVEL");
	setResizable(false);
	setSize(800, 600);

	/* Traitement du Look & Feel : L&F Java. */
	try {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	} catch (Exception error) {
	}

	/* Gestion de la fermeture de cette frame. */
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose(); // On ferme la fenetre.
			System.exit(1);
		}
	});

	/* Creation d'une panel conteneur. */
	/* Frame principale de dialogue. */
    JPanel panel = new JPanel();
	panel.setBackground(new java.awt.Color(0, 0, 0));
	panel.setLayout(null);
	
	/* Ajout de la barre de menus. */
	barreMenu = new BarreDuMenu(this);
	setJMenuBar(barreMenu);
	
	/* La frame est a l'ecoute des touches frappees par le joueur. */
	addKeyListener(this);	

	/* Le canvas de la piece suivante. */
	cps = new CanvasPieceSuivante();
	cps.setBounds(550, 45, 162, 162);
	panel.add(cps);

	/* Le canvas de la piece suivante. */
	canvas = new MonCanvas(this);
	canvas.setBounds(17, 27, 600, 482);
	panel.add(canvas);

	/* Le label de la piece suivante. */
	labelApercu = new JLabel();
	labelApercu.setText("PIECE SUIVANTE");
	labelApercu.setForeground(Color.ORANGE);
	labelApercu.setFont(new java.awt.Font("dialog", 1, 24));
	labelApercu.setBounds(560, 5, 270, 32);
	panel.add(labelApercu);

	/* Label du niveau. */
	labelLevel = new JLabel("NIVEAU : 1 ");
	labelLevel.setForeground(Color.ORANGE);
	labelLevel.setFont(new java.awt.Font("dialog", 1, 24));
	labelLevel.setBounds(575, 240, 250, 36);
	panel.add(labelLevel);

	/* Label des scores. */
	labelScore = new JLabel("SCORE  : 0 ");
	labelScore.setForeground(Color.ORANGE);
	labelScore.setFont(new java.awt.Font("dialog", 1, 24));
	labelScore.setBounds(575, 290, 250, 36);
	panel.add(labelScore);

	/* Label du nombre de ligne. */
	labelLigne = new JLabel("LIGNE   : 0 ");
	labelLigne.setForeground(Color.ORANGE);
	labelLigne.setFont(new java.awt.Font("dialog", 1, 24));
	labelLigne.setBounds(575, 350, 250, 36);
	panel.add(labelLigne);

	/* Ajout du panel dans la frame. */
	getContentPane().add(panel);

	/* Affichage de la frame. */
	show();
}
/**
 * Renvoie du canvas d'affichage du jeu.

 * @return MonCanvas Le canvas d'affichage. */
public MonCanvas getCanvas() {
	return canvas;
}
/**
 * Renvoie du canvas d'affichage de la piece suivante..

 * @return MonCanvas Le canvas d'affichage de la piece suivante. */
public CanvasPieceSuivante getCps() {
	return cps;
}
/**
 * Renvoie le label "Piece Suivante".

 * @return labelApercu Le label "Piece suivante". */
public JLabel getLabelApercu() {
	return labelApercu;
}
/**
 * Actions a effectuer losqu'une touche a ete pressee.
 * On passe la touche pressee au canvas.
 * @param e Evenement de saisie de caractere.

 * @see java.awt.event.KeyListener#keyPressed(KeyEvent) */
@Override
public void keyPressed(KeyEvent e) {
	canvas.testKey(e.getKeyCode());
	canvas.repaint();
}
/**
 * Actions a effectuer losqu'une touche a ete relachee : on ne fait rien !!
 * @param e Evenement de saisie de caractere.

 * @see java.awt.event.KeyListener#keyReleased(KeyEvent) */
@Override
public void keyReleased(KeyEvent e) {
}
/**
 * Actions a effectuer losqu'une touche a ete tapee : on transmet le caractere lu.
 * @param e Evenement de saisie de caractere.

 * @see java.awt.event.KeyListener#keyTyped(KeyEvent) */
@Override
public void keyTyped(KeyEvent e) {
}
/**
 * Methode main.
 * Lancement du Tetris.
 * @param args Tableau d'arguments. Normalement Vide...
 */
public static void main(String args[]) {
	/* Lancement du tetris. */
	@SuppressWarnings("unused")
	Tetris tetris = new Tetris();
}
/**
 * Autorise l'affichage du menu Option avec les niveaux et les handicaps.
 */
public void setEnabledMenuOptions() {
	barreMenu.setEnabledMenuOptions(true);
}
/**
 * Reaffiche la label du niveau.
 * @param level Le niveau en cours.
 */
public void setLabelLevel(int level) {
	labelLevel.setText("NIVEAU : " + level);
}
/**
 * Reaffiche la label du nombre de lignes.
 * param level Le nombre de lignes en cours.
 * @param ligne int
 */
public void setLabelLigne(int ligne) {
	if (ligne > 1) {
		labelLigne.setText("LIGNES : " + ligne);
	} else {
		labelLigne.setText("LIGNE   : " + ligne);
	}
}
/**
 * Reaffiche la score actuel.
 * param level Le score actuel.
 * @param score int
 */
public void setLabelScore(int score) {
	labelScore.setText("SCORE  : " + score);
}
}