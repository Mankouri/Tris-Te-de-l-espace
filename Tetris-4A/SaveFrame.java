import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 * Frame simple de saisie du nom et de sauvegarde d'une piece 'utilisateur'.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
 
public class SaveFrame extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Matrice destinee a contenir la piece. */
	private Matrix mat;
	/** Frame de saisie. */
	private static JFrame frame;
	/** Zone de saisie du nom du fichier. */
	private static JTextField nomFichier;
	/** Bouton de sauvegarde. */
	private static JButton buttonSave;
	/** Bouton d'annulation de sauvegarde: */
	private static JButton buttonAnnuler;
/**
 * Constructeur de la frame de sauvegarde de pieces.
 * param path Chemin par defaut de stockage du fichier
 * param pieceEdit Editeur de piece a qui retourner la matrice de la piece.
 * @param path String
 * @param mat Matrix
 */
@SuppressWarnings("deprecation")
public SaveFrame(String path, Matrix mat) {
	super();
	/* Traitement du Look & Feel : L&F Java. */
	try {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	} catch (Exception error) {
	}
	this.mat = mat;

	/* Creation d'une nouvelle frame. */
	frame = new JFrame("Sauver une piece");

	/* Gestion de la fermeture de cette frame.*/
	frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			frame.dispose(); // On ferme la fenetre.
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
	
	/* Cr�ation des boutons de validation et annulation de la commande: */
	JPanel pan3 = new JPanel();
	buttonSave = new JButton("Sauver");
	buttonSave.addActionListener(this);
	pan3.add(buttonSave);
	buttonAnnuler = new JButton("Annuler");
	buttonAnnuler.addActionListener(this);
	pan3.add(buttonAnnuler);
	add(pan3, "South");
	
	/* Insertion du panel et affichage. */
	frame.getContentPane().add("Center", this);
	frame.pack();
	frame.show();
}
/**
 * Actions � effectuer dans le cas d'appui sur 'Sauver' ou 'Annuler'.
 * @param e Evenement d'appel.
 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent)
 */
public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("Annuler")) {
		frame.dispose();
	} else if (e.getActionCommand().equals("Sauver")) {
		sauverMat(nomFichier.getText(), mat);
		if (mat != null) {
			frame.dispose();
		}
	}
}
/**
 * Sauve une matrice contenue dans un fichier dont le nom est passe en parametre.
 * @param nomFic Nom du fichier contenant la piece a lire.

 * @param mat Matrix
 */
 
@SuppressWarnings("resource")
public void sauverMat(String nomFic, Matrix mat) {
	FileOutputStream fic;
	ObjectOutputStream out;
	/* On ouvre le fichier: */
	try {
		fic = new FileOutputStream(nomFic);
	} catch (IOException e) {
		System.out.println("Impossible d'ouvrir le fichier en ecriture " + nomFic + " !");
		return;
	}
	/* La matrice de la piece est stockee en tant qu'objet du type Matrice: */
	try {
		out = new ObjectOutputStream(fic);
	} catch (IOException e) {
		System.out.println("Impossible d'ouvrir le flux !");
		return;
	}
	/* On ecrit la matrice de la piece: */
	try {
		out.writeObject(mat);
	} catch (IOException e) {
		System.out.println("Impossible d'ecrire dans le flux !");
	}
	/* Fermeture du fichier concernee: */
	try {
		out.close();
	} catch (IOException e) {
		System.out.println("Impossible de fermer le flux !");
		return;
	}
}
}