import java.awt.Color;

/**
 * Palette de couleurs predefinies locale a Tetris.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */

 final class Couleur {
	 /** Taille de la palette. */
	private final static int size = 4;  
/**
 * Retourne la couleur en fonction de son numero dans la palette.
 * @param couleur Indice de la couleur.

 * @return La couleur dans la classe Color. */

public final static Color getCouleur(int couleur) {
	Color color = Color.yellow;
	switch (couleur) {
		case 0 :
			color = new Color(255, 128, 128); // Rouge clair.
			break;
		case 1 :
			color = new Color(128, 255, 128); // Vert clair.
			break;
		case 2 :
			color = new Color(128, 128, 255); // Bleu clair.
			break;
		case 4 :
			color = new Color(255, 215, 0); //or.
			break;
	}
	/* Retourne blanc si aucune correspondance n'a ete trouvee: */
	return color;
}
/**
 * Retourne le nom de la couleur associe a son numero dans la palette.
 * @param couleur Indice de la couleur.

 * @return La chaine descriptive de la couleur. */

public final static String getNomCouleur(int couleur) {
	String nom = "";
	switch (couleur) {
		case 0 :
			nom = "Rouge clair"; // Rouge clair.
			break;
		case 1 :
			nom = "Vert clair"; // Vert clair.
			break;
		case 2 :
			nom = "Bleu clair"; // Bleu clair.
			break;
		case 3 :
			nom = "or"; // or
			break;
	}
	/* Retourne une chaine vide si aucune correspondance n'a ete trouvee: */
	return nom;
}
/**
 * Retourne la taille de la palette de couleurs.

 * @return La taille de la palette de couleurs. */

public final static int getSize() {
	return size;
}
}