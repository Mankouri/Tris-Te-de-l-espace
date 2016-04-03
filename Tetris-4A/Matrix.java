/**
 * Definition d'une matrice carrée d'entiers (Utilisée pour définir la matrice
 * de chacune des pièces).
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL
 * @version $Revision: 1.0 $
 */
 
public class Matrix {
	/** Taille de la matrice (carrée). */
	int size;
	/** tableau d'entiers. */
	private int matrice[][];

/**
 * Constructeur de la classe Matrix.
 * @param size La taille de la matrice.
 */
 
public Matrix(int size) {
	/* Initialisation de la taille et allocation de la table de la matrice: */
	this.size = size;
	matrice = new int[size][size];
	/* On initialise toutes les cases de la matrice à -1 (pas de bloc graphique): */
	for (int x = 0; x < size; x++) {
		for (int y = 0; y < size; y++) {
			matrice[x][y] = -1;
		}
	}
}
/**
 * Retourne la taille de la matrice carree.

 * @return La taille de la matrice. */
 
public int getSize() {
	return size;
}
/**
 * Retourne la valeur stockee à une position donnee dans la matrice.
 * @param x Colonne
 * @param y Ligne.

 * @return La valeur stockee dans la matrice. */

public int getVal(int x, int y) {
	/* On teste si les coordonnees appartiennent bien a la matrice: */
	if ((x >= 0) && (y >= 0) && (x < size) && (y < size)) {
		return matrice[x][y];
	}
	/* On retourne -1 sinon (out of range donc pas de bloc graphique): */
	return -1;
}
/**
 * Effectue une rotation de la matrice dans un sens ou un autre (!=transposee!).
 * @param sens Sens de rotation.
 */

public void rotation(boolean sens) {
	for (int y = 0; y < size / 2; y++) {
		for (int x = 0; x < size; x++) {
			int temp = matrice[x][y];
			matrice[x][y] = matrice[x][size - 1 - y];
			matrice[x][size - 1 - y] = temp;
		}
	}
	/* Suivant le sens de rotation, on effectue la transposee ou la transposee par
	/* rapport a l'autre diagonale. */
	if (sens) {
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size - y; x++) {
				int temp = matrice[x][y];
				matrice[x][y] = matrice[size - 1 - y][size - 1 - x];
				matrice[size - 1 - y][size - 1 - x] = temp;
			}
		}
	} else {
		transpose();
	}
}
/**
 * Affecte une valeur a une certaine coordonnee de la matrice.
 * @param x Colonne
 * @param y Ligne
 * @param val Valeur a stocker.
 */

public void setVal(int x, int y, int val) {
	/* On teste si les coordonnees appartiennent bien a la matrice: */
	if ((x >= 0) && (y >= 0) && (x < size) && (y < size)) {
		matrice[x][y] = val;
	}
}
/**
 * Calcule et stocke la transposee de la matrice.
 */

public void transpose() {
	for (int y = 0; y < size; y++) {
		for (int x = 0; x < y; x++) {
			int temp = matrice[x][y];
			matrice[x][y] = matrice[y][x];
			matrice[y][x] = temp;
		}
	}
}
}