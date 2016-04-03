import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

/**
 * Barre de menus contenant: Jeu, Options, Personnaliser
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
public class BarreDuMenu extends JMenuBar implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8070116015707463038L;
	/* Par defaut, l'handicape est a 0 et on commence */
	/* au premier niveau: */
	private static int handicap=0;
	private static int niveau=1;
	private Tetris tetris;
	private JMenu menuJeu;
	private JMenu menuOptions;
	private JMenu menuOptionsNiveau;
	private JMenu menuOptionsHandicap;
	private JMenu menuPersonnaliser;
	private JMenuItem itemPause;
	private JMenuItem itemDemarrer;
	private JCheckBoxMenuItem checkBoxVoirPiece;
	private JRadioButtonMenuItem radioButton1Player;
	private JRadioButtonMenuItem radioButton2Player;
	private JRadioButtonMenuItem radioButtonNiveau1;
	private JRadioButtonMenuItem radioButtonNiveau2;
	private JRadioButtonMenuItem radioButtonNiveau3;
	private JRadioButtonMenuItem radioButtonNiveau4;
	private JRadioButtonMenuItem radioButtonNiveau5;
	private JRadioButtonMenuItem radioButtonNiveau6;
	private JRadioButtonMenuItem radioButtonNiveau7;
	private JRadioButtonMenuItem radioButtonNiveau8;
	private JRadioButtonMenuItem radioButtonNiveau9;
	private JRadioButtonMenuItem radioButtonNiveau10;
	private JRadioButtonMenuItem radioButtonHandicap0;
	private JRadioButtonMenuItem radioButtonHandicap1;
	private JRadioButtonMenuItem radioButtonHandicap2;
	private JRadioButtonMenuItem radioButtonHandicap3;
	private JRadioButtonMenuItem radioButtonHandicap4;
	private JRadioButtonMenuItem radioButtonHandicap5;
	private JRadioButtonMenuItem radioButtonHandicap6;
	private JRadioButtonMenuItem radioButtonHandicap7;
/**
 * Constructeur de la barre de menu.
 * Permet l'initialisation des differents menus.
 * @param tetris La frame principale qui contient la barre de menus.
 */
public BarreDuMenu(Tetris tetris) {
	super();
	
	/* Sauvegarde du tetris dans le cas ou l'on veut modifier */
	/* les parametres du jeu: */
	this.tetris = tetris;
	
	/* Les menus: */
	menuJeu();
	menuOptions();
	menuPersonnaliser();

	
	add(menuJeu);
	add(menuOptions);
	add(menuPersonnaliser);
}
/*
 * @param e L'evenement produit sur le menu.
 */
/**
 * Method actionPerformed.
 * @param e ActionEvent

 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
@Override
public void actionPerformed(ActionEvent e) {
	String commande = e.getActionCommand();
	MonCanvas canvas = tetris.getCanvas();
	Jeu jeu = canvas.getJeu();
	
	/* Menu Jeu: */
	switch (commande) {
		case "Nouvelle Partie":
			setEnabledMenuOptions(false);
			jeu.nouveauJeu();
			jeu.setHandicap(handicap);
			jeu.setNiveau(niveau);
			canvas.startThread();
			canvas.repaint();
			break;
		case "Pause":
			canvas.stopThread();
			itemPause.setEnabled(false);
			itemDemarrer.setEnabled(true);
			break;
		case "Reprendre":
			canvas.startThread();
			itemPause.setEnabled(true);
			itemDemarrer.setEnabled(false);
			break;
		case "Quitter le jeu":
			System.exit(1);

/* Menu Options: */
		case "voir pieces suivantes":
			if (checkBoxVoirPiece.getState()) {
				tetris.getCps().setVisible(true);
				tetris.getLabelApercu().setVisible(true);
			} else {
				tetris.getLabelApercu().setVisible(false);
				tetris.getCps().setVisible(false);
			}
			break;
		case "Niveau 1":  // Sous-menu des niveaux.
			resetNiveau();
			niveau = 1;
			jeu.setNiveau(1);
			break;
		case "Niveau 2":
			resetNiveau();
			niveau = 2;
			jeu.setNiveau(2);
			break;
		case "Niveau 3":
			resetNiveau();
			niveau = 3;
			jeu.setNiveau(3);
			break;
		case "Niveau 4":
			resetNiveau();
			niveau = 4;
			jeu.setNiveau(4);
			break;
		case "Niveau 5":
			resetNiveau();
			niveau = 5;
			jeu.setNiveau(5);
			break;
		case "Niveau 6":
			resetNiveau();
			niveau = 6;
			jeu.setNiveau(6);
			break;
		case "Niveau 7":
			resetNiveau();
			niveau = 7;
			jeu.setNiveau(7);
			break;
		case "Niveau 8":
			resetNiveau();
			niveau = 8;
			jeu.setNiveau(8);
			break;
		case "Niveau 9":
			resetNiveau();
			niveau = 9;
			jeu.setNiveau(9);
			break;
		case "Niveau 10":
			resetNiveau();
			niveau = 10;
			jeu.setNiveau(10);
			break;
		case "Handicap 0":  // Sous-menu des handicapes.
			resetHandicap();
			handicap = 0;
			break;
		case "Handicap 1":
			resetHandicap();
			handicap = 1;
			break;
		case "Handicap 2":
			resetHandicap();
			handicap = 2;
			break;
		default:
			switch (commande) {
				case "Handicap 3":
					resetHandicap();
					handicap = 3;
					break;
				case "Handicap 4":
					resetHandicap();
					handicap = 4;
					break;
				case "Handicap 5":
					resetHandicap();
					handicap = 5;
					break;
				case "Handicap 6":
					resetHandicap();
					handicap = 6;
					break;
				case "Handicap 7":
					resetHandicap();
					handicap = 7;
					break;
				case "solo":
					radioButton1Player.setSelected(true);
					radioButton2Player.setSelected(false);
					jeu.setSocket(null, true);
					break;
				case "multi":
					radioButton1Player.setSelected(false);
					radioButton2Player.setSelected(true);
					new ConnectFrame(jeu, "");
					break;
				case "Meilleurs Scores":
					new FrameBestScore();
					break;
	/* Menu Personnaliser: */
				case "Editer Nouvelle Piece":
					new PieceEdit(5, jeu);
					break;
			}
			break;
	}

}

/**
 * Le menu de Jeu.
 */
private void menuJeu() {
	/* La barre principale. */
	menuJeu = new JMenu("Jeu");
	menuJeu.setMnemonic('j');
	menuJeu.setHorizontalAlignment(SwingConstants.CENTER);
	menuJeu.setHorizontalTextPosition(SwingConstants.CENTER);

	/* Les item de cette barre. */
	JMenuItem itemNouvelle = new JMenuItem("Nouvelle Partie");
	itemNouvelle.setMnemonic('n');
	JSeparator separator2 = new JSeparator();
	itemPause	= new JMenuItem("Pause");
	itemPause.setMnemonic('p');
	itemDemarrer = new JMenuItem("Reprendre");
	itemDemarrer.setMnemonic('r');
	itemDemarrer.setEnabled(true);
	itemDemarrer.setEnabled(false);
	JSeparator separator3 = new JSeparator();
	JMenuItem itemQuitter = new JMenuItem("Quitter");
	itemQuitter.setMnemonic('q');

	/* On ajoute les item a la barre. */
	menuJeu.add(itemNouvelle);
	menuJeu.add(separator2);
	menuJeu.add(itemPause);
	menuJeu.add(itemDemarrer);
	menuJeu.add(separator3);
	menuJeu.add(itemQuitter);

	/* Les ecouteurs. */
	itemNouvelle.addActionListener(this);
	itemPause.addActionListener(this);
	itemDemarrer.addActionListener(this);
	itemQuitter.addActionListener(this);
}
/**
 * Le menu des Options.
 */
private void menuOptions() {
	menuOptions = new JMenu("Options");
	menuOptions.setMnemonic('O');
	menuOptions.setHorizontalAlignment(SwingConstants.CENTER);
	menuOptions.setHorizontalTextPosition(SwingConstants.CENTER);

	/* apercu de la piece */
	checkBoxVoirPiece = new JCheckBoxMenuItem("afficher piece suivante");
	checkBoxVoirPiece.setSelected(true);
	JSeparator separator4 = new JSeparator();
	
	/* Les niveaux et les handicaps*/
	menuOptionsNiveau();
	menuOptionsHandicap();
	
	/* Le nombre de joueurs */
	JSeparator separator6 = new JSeparator();
	radioButton1Player = new JRadioButtonMenuItem("solo");
	radioButton1Player.addActionListener(this);
	radioButton1Player.setSelected(true);
	radioButton2Player = new JRadioButtonMenuItem("multi");
	radioButton2Player.addActionListener(this);

	/* voir les meilleurs scores. */
	JSeparator separator7 = new JSeparator();
	JMenuItem itemBestScore = new JMenuItem("Meilleurs Scores");
	

	menuOptions.add(checkBoxVoirPiece);
	menuOptions.add(separator4);
	menuOptions.add(menuOptionsNiveau);
	menuOptions.add(menuOptionsHandicap);	
	menuOptions.add(separator6);
	menuOptions.add(radioButton1Player);
	menuOptions.add(radioButton2Player);
	menuOptions.add(separator7);
	menuOptions.add(itemBestScore);

	/* Les Ecouteurs. */
	checkBoxVoirPiece.addActionListener(this);
	itemBestScore.addActionListener(this);
}
/**
 * Le menu lorsque que l'on est dans l'onglet des handicaps.
 */
private void menuOptionsHandicap() {
	menuOptionsHandicap = new JMenu("Handicap");

	/* Declaration de tous les RadioButton */
	radioButtonHandicap0 = new JRadioButtonMenuItem("Handicap 0");
	radioButtonHandicap1 = new JRadioButtonMenuItem("Handicap 1");
	radioButtonHandicap2 = new JRadioButtonMenuItem("Handicap 2");
	radioButtonHandicap3 = new JRadioButtonMenuItem("Handicap 3");
	radioButtonHandicap4 = new JRadioButtonMenuItem("Handicap 4");
	radioButtonHandicap5 = new JRadioButtonMenuItem("Handicap 5");
	radioButtonHandicap6 = new JRadioButtonMenuItem("Handicap 6");
	radioButtonHandicap7 = new JRadioButtonMenuItem("Handicap 7");

	/* Ajout au menu princial. */
	menuOptionsHandicap.add(radioButtonHandicap0);
	menuOptionsHandicap.add(radioButtonHandicap1);
	menuOptionsHandicap.add(radioButtonHandicap2);
	menuOptionsHandicap.add(radioButtonHandicap3);
	menuOptionsHandicap.add(radioButtonHandicap4);
	menuOptionsHandicap.add(radioButtonHandicap5);
	menuOptionsHandicap.add(radioButtonHandicap6);
	menuOptionsHandicap.add(radioButtonHandicap7);

	/* Les ecouteurs. */
	radioButtonHandicap0.addActionListener(this);
	radioButtonHandicap1.addActionListener(this);
	radioButtonHandicap2.addActionListener(this);
	radioButtonHandicap3.addActionListener(this);
	radioButtonHandicap4.addActionListener(this);
	radioButtonHandicap5.addActionListener(this);
	radioButtonHandicap6.addActionListener(this);
	radioButtonHandicap7.addActionListener(this);

	/* Initialisations par defaut. */
	radioButtonHandicap0.setSelected(true);
	menuOptionsHandicap.setEnabled(false);
}
/**
 * Menu de gestion des difeerents niveaux.
 */
private void menuOptionsNiveau() {
	menuOptionsNiveau = new JMenu("Niveau");

	/* Declaration des item. */
	radioButtonNiveau1 = new JRadioButtonMenuItem("Niveau 1");
	radioButtonNiveau2 = new JRadioButtonMenuItem("Niveau 2");
	radioButtonNiveau3 = new JRadioButtonMenuItem("Niveau 3");
	radioButtonNiveau4 = new JRadioButtonMenuItem("Niveau 4");
	radioButtonNiveau5 = new JRadioButtonMenuItem("Niveau 5");
	radioButtonNiveau6 = new JRadioButtonMenuItem("Niveau 6");
	radioButtonNiveau7 = new JRadioButtonMenuItem("Niveau 7");
	radioButtonNiveau8 = new JRadioButtonMenuItem("Niveau 8");
	radioButtonNiveau9 = new JRadioButtonMenuItem("Niveau 9");
	radioButtonNiveau10 = new JRadioButtonMenuItem("Niveau 10");

	/* Ajout au menu principal. */
	menuOptionsNiveau.add(radioButtonNiveau1);
	menuOptionsNiveau.add(radioButtonNiveau2);
	menuOptionsNiveau.add(radioButtonNiveau3);
	menuOptionsNiveau.add(radioButtonNiveau4);
	menuOptionsNiveau.add(radioButtonNiveau5);
	menuOptionsNiveau.add(radioButtonNiveau6);
	menuOptionsNiveau.add(radioButtonNiveau7);
	menuOptionsNiveau.add(radioButtonNiveau8);
	menuOptionsNiveau.add(radioButtonNiveau9);
	menuOptionsNiveau.add(radioButtonNiveau10);

	/* Les ecouteurs. */
	radioButtonNiveau1.addActionListener(this);
	radioButtonNiveau2.addActionListener(this);
	radioButtonNiveau3.addActionListener(this);
	radioButtonNiveau4.addActionListener(this);
	radioButtonNiveau5.addActionListener(this);
	radioButtonNiveau6.addActionListener(this);
	radioButtonNiveau7.addActionListener(this);
	radioButtonNiveau8.addActionListener(this);
	radioButtonNiveau9.addActionListener(this);
	radioButtonNiveau10.addActionListener(this);

	/* Les initialisations par defaut.*/
	radioButtonNiveau1.setSelected(true);
	menuOptionsNiveau.setEnabled(false);
	}
/**
 * Menu Personaliser afin de creer ses propres pieces.
 */
private void menuPersonnaliser() {
	/* Declaration principale. */
	menuPersonnaliser = new JMenu("Personnaliser");
	menuPersonnaliser.setMnemonic('p');
	menuPersonnaliser.setHorizontalAlignment(SwingConstants.CENTER);
	menuPersonnaliser.setHorizontalTextPosition(SwingConstants.CENTER);

	/* Ajout des item. */
	JMenuItem itemEditer = new JMenuItem("Editer Nouvelle Piece");

	/* Ajout au menu principal. */
	menuPersonnaliser.add(itemEditer);
	
	/* Un ecouteur. */
	itemEditer.addActionListener(this);
}
/**
 * Gestion des radioButton des handicaps. On desactive le precedent button selectionne. 
 */
private void resetHandicap() {
	switch (handicap) {
		case 0 :
			radioButtonHandicap0.setSelected(false);
			break;
		case 1 :
			radioButtonHandicap1.setSelected(false);
			break;
		case 2 :
			radioButtonHandicap2.setSelected(false);
			break;
		case 3 :
			radioButtonHandicap3.setSelected(false);
			break;
		case 4 :
			radioButtonHandicap4.setSelected(false);
			break;
		case 5 :
			radioButtonHandicap5.setSelected(false);
			break;
		case 6 :
			radioButtonHandicap6.setSelected(false);
			break;
		case 7 :
			radioButtonHandicap7.setSelected(false);
			break;
	}
}
/**
 * Gestion des radioButton des niveaux. On desactive le precedent boutons selectionnes.
 */
private void resetNiveau() {
	switch (niveau) {
		case 1 :
			radioButtonNiveau1.setSelected(false);
			break;
		case 2 :
			radioButtonNiveau2.setSelected(false);
			break;
		case 3 :
			radioButtonNiveau3.setSelected(false);
			break;
		case 4 :
			radioButtonNiveau4.setSelected(false);
			break;
		case 5 :
			radioButtonNiveau5.setSelected(false);
			break;
		case 6 :
			radioButtonNiveau6.setSelected(false);
			break;
		case 7 :
			radioButtonNiveau7.setSelected(false);
			break;
		case 8 :
			radioButtonNiveau8.setSelected(false);
			break;
		case 9 :
			radioButtonNiveau9.setSelected(false);
			break;
		case 10 :
			radioButtonNiveau10.setSelected(false);
			break;
	}
}
/**
 * Activation ou desactivation des menus niveau et handicap.
 * @param bool true => Affichage autorise. False => Affichage refuse.
 */
void setEnabledMenuOptions(boolean bool) {
	if (bool) {
		menuOptionsNiveau.setEnabled(true);
		menuOptionsHandicap.setEnabled(true);
	} else {
		menuOptionsNiveau.setEnabled(false);
		menuOptionsHandicap.setEnabled(false);
	}
}
}