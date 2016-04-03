import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 * Frame simple de saisie du nom et de lecture d'une pièce 'utilisateur'.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
 
public class LoadFrame extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Matrice destinee à contenir la piece. */
	private Matrix mat;
	/** Contient a qui retourner la piece lue. */
	private PieceEdit pieceEdit;
	/** Frame de saisie. */
	private static JFrame frame;
	/** Zone de saisie du nom du fichier. */
	private static JTextField nomFichier;
	/** Bouton de chargement. */
	private static JButton buttonLoad;
	/** Bouton d'annulation de chargement: */
	private static JButton buttonAnnuler;
/**
 * Constructeur de la frame de chargement de pieces.
 * @param path Chemin par defaut de stockage du fichier
 * @param pieceEdit Editeur de piece a qui retourner la matrice de la piece.
 */
@SuppressWarnings("deprecation")
public LoadFrame(String path, PieceEdit pieceEdit) {
	super();
	/* Traitement du Look & Feel : L&F Java. */
	try {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	} catch (Exception error) {
	}
	this.pieceEdit = pieceEdit;
	/* Creation d'une nouvelle frame. */
	frame = new JFrame("Charger une piece");

	/* Gestion de la fermeture de cette frame. */
	frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			frame.dispose(); // On ferme la fenêtre.
		}
	});
	setLayout(new BorderLayout());
	JPanel statPanel = new JPanel();
	statPanel.setLayout(new BorderLayout());
	JPanel pan1 = new JPanel();
	/* Label de demande de saisie du nom de fichier: */
	pan1.add(new JLabel("Nom du fichier: "));
	/* Zone de saisie du nom du fichier: */
	nomFichier = new JTextField(path, 20);
	pan1.add(nomFichier);
	statPanel.add(pan1, "Center");
	JPanel pan2 = new JPanel();
	statPanel.add(pan2, "East");
	add(statPanel, "East");
	/* Création des boutons de validation et annulation de la commande: */
	JPanel pan3 = new JPanel();
	buttonLoad = new JButton("Charger");
	buttonLoad.addActionListener(this);
	pan3.add(buttonLoad);
	buttonAnnuler = new JButton("Annuler");
	buttonAnnuler.addActionListener(this);
	pan3.add(buttonAnnuler);
	add(pan3, "South");
	frame.getContentPane().add("Center", this);
	frame.pack();
	frame.show();
}
/**
 * Actions a effectuer dans le cas d'appui sur 'Charger' ou 'Annuler'.
 * @param e Evenement d'appel.
 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent)
 */
public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("Annuler")) {
		frame.dispose();
	} else if (e.getActionCommand().equals("Charger")) {
		/* Si on a reussit à charger la matrice de la piece, on la retourne: */
		if (chargerMat(nomFichier.getText()) == true) {
			pieceEdit.setMatrix(mat);
			frame.dispose();
		}
	}
}
/**
 * Charge une matrice contenue dans un fichier dont le nom est passé en paramètre.
 * @param nomFic Nom du fichier contenant la pièce à lire.

 * @return true Lecture réussie ; false: lecture échouée. */
 
@SuppressWarnings("resource")
public boolean chargerMat(String nomFic) {
	FileInputStream fic;
	ObjectInputStream in;
	/* On ouvre le fichier: */
	try {
		fic = new FileInputStream(nomFic);
	} catch (IOException e) {
		return false;
	}
	/* La matrice de la piece a été stockée en tant qu'objet du type Matrice: */
	try {
		in = new ObjectInputStream(fic);
	} catch (IOException e) {
		return false;
	}
	/* On lit la matrice de la piece: */
	try {
		mat = (Matrix) in.readObject();
	} catch (Exception e) {
		return false;
	}
	/* Fermeture du fichier concerné: */
	try {
		in.close();
	} catch (IOException e) {
		return false;
	}
	return true;
}
}