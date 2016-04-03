import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 * Affiche la frame principale de connexion en mode 2 joueurs.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
public class ConnectFrame extends JPanel implements ActionListener, Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 563364953385343463L;
	/** La demande en tant que serveur est threadee afin de pouvoir le stopper lors du accept().*/
	private Thread thread; // 
	/**  Socket retourne par le client ou le serveur. */
	@SuppressWarnings("unused")
	private Socket socket;
	/** Jeu en cours. Necessaire pour lui passe le socket.*/
	private Jeu jeu;
	/** Frame d'affichage du menu. */
	private static JFrame frame;
	/** Bouton radio du serveur. */
	private static JRadioButton buttonServeur;
	/** Bouton radio du client.*/
	private static JRadioButton buttonClient;
	/** Zone de saisie de l'adresse du serveur.*/
	private static JTextField addClient;
	/** Label de saisie de l'adresse du serveur. */
	private static JLabel labelClient;
	/** Bouton de lancement de la connexion. */
	private static JButton buttonConnecter; 
/**
 * Constructeur de la frame de Connexion.
 * @param jeu Le jeu en cours.
 * @param defaultPath Chemin par defaut de la machine ou se fait la connxion.
 */
@SuppressWarnings("deprecation")
public ConnectFrame(Jeu jeu, String defaultPath) {
	super();
	this.jeu = jeu; // Affectation du jeu.
	thread = null;  // Pas de thread pour l'instant.
	socket = null;  // Pas de socket.
	
	/* traitement du Look & Feel : L&F Java: */
	try {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	} catch (Exception error) {
	}

	/* Creation d'une nouvelle frame: */
	frame = new JFrame("Se connecter a un autre joueur");

	/* Gestion de la fermeture de cette frame. */
	frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			frame.dispose(); // On ferme la fenetre.
		}
	});

	/* Un BorderLayout pour disposer les Component. */
	setLayout(new BorderLayout());
	/* Panel de la Frame. */
	JPanel pan1 = new JPanel();
	pan1.setLayout(new BorderLayout());
	/* Panel Interne ^place au nord contenant le radioButton du serveur.*/
	JPanel subPan1 = new JPanel();
	/* Les differents boutons. */
	buttonServeur = new JRadioButton(" Attendre un appel de la part du joueur numero 2                               ");
	buttonServeur.setActionCommand("Serveur");
	buttonServeur.addActionListener(this);
	buttonServeur.setSelected(true);
	subPan1.add(buttonServeur);
	pan1.add(subPan1, "North");
	
	/* Deuxieme panel interne place au centre traitant le client. */
	JPanel subPan2 = new JPanel();
	buttonClient = new JRadioButton(" Appeler le joueur numero 2");
	buttonClient.setActionCommand("Client");
	buttonClient.addActionListener(this);
	buttonClient.setSelected(false);
	labelClient = new JLabel("a l'adresse:");
	labelClient.setEnabled(false);
	addClient = new JTextField(defaultPath, 12);
	addClient.setEnabled(false);
	subPan2.add(buttonClient);
	subPan2.add(labelClient);
	subPan2.add(addClient);
	pan1.add(subPan2, "Center");
	
	/* On place pan1 a l'ouest du panel principal. */
	add(pan1, "West");

	/* Troisieme panel interne place au sud contenant les boutons de commande. */
	JPanel pan3 = new JPanel();
	buttonConnecter = new JButton("Ecouter...");
	buttonConnecter.setActionCommand("Try");
	buttonConnecter.addActionListener(this);
	pan3.add(buttonConnecter);
	JButton buttonAnnuler = new JButton("Annuler");
	buttonAnnuler.addActionListener(this);
	pan3.add(buttonAnnuler);
	add(pan3, "South");
	
	/* On place le tout dans la frame. */
	frame.getContentPane().add("Center", this);
	frame.pack();
	frame.show();
}
/**
 * Gestion des evenements sur les boutons de la frame.
 * @param e L'evenement des boutons.
 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent)
 */
@SuppressWarnings("deprecation")
public void actionPerformed(ActionEvent e) {
	String action = e.getActionCommand(); // Action generee.

	if (action.equals("Annuler")) {       // Bouton Annule.
		frame.dispose();                  // On ferme le tout. 
		if (thread != null) {
			thread.stop();
			thread = null;
		}
	} else if (action.equals("Serveur")) { // On veut etre serveur.
		buttonClient.setSelected(false);   // On desactive le client.
		buttonServeur.setSelected(true);
		labelClient.setEnabled(false);
		labelClient.repaint();
		addClient.setEnabled(false);
		buttonConnecter.setText("Ecouter...");
	} else if (action.equals("Client")) {  // On veut etre le client.
		buttonClient.setSelected(true);    // On desactive le serveur.
		buttonServeur.setSelected(false);
		labelClient.setEnabled(true);
		labelClient.repaint();
		addClient.setEnabled(true);
		buttonConnecter.setText("Appeler...");
	} else if (action.equals("Try")) { // On commence l'ecoute.
		if (buttonConnecter.getText().equals("Ecouter...")) { // Le client.
			thread = new Thread(this);
			thread.start();
		} else { // Le serveur.
			setSocket(Client.getSocket(addClient.getText()));
		}
	}
}
/**
 * Methode run de l'interface Runnable.
 * @see java.lang.Runnable#run()
 */
public void run() {
	@SuppressWarnings("unused")
	ServeurFrame serveurFrame = new ServeurFrame(this); // On lance un serveur Frame.
	while (true) {
		try { // Thread en attente.
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}
/**
 * Affecte le socket de communication avec le 2eme joueur
 * Celui-ci est retourne au jeu.
 * @param socket Socket a passer.
 */
@SuppressWarnings({ "deprecation" })
public void setSocket(Socket socket) {
	/* Si le socket est a null, la communication n'a pu etre effectuee */
	/* ou l'operation a ete annulee: */
	if (socket == null) {
		new JFrameMsg("Demande de connexion", "Impossible de se connecter au joueur numero 2");
		if (thread != null) {
			thread.stop();
			thread = null;
		}
	} else {
		/* Le socket n'est pas null -> l'operation s'est bien passee. */
		this.socket = socket;
		jeu.setSocket(socket,false);
		frame.dispose();
		if (thread != null) {
			thread.stop();
			thread = null;
		}
		if (socket != null) {
			new JFrameMsg("Demande de connexion", "connection OK, Bonne partie !");
		}
	}
}
}