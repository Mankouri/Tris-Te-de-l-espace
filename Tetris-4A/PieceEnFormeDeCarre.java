/**
 * Piece de type: carre.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */ 
public class PieceEnFormeDeCarre extends Piece {
/**
 * Constructeur du carre.
 * @param posX L'abscisse du carre dans la matrice.
 * @param posY L'ordonnee de la piece.
 */

public PieceEnFormeDeCarre(int posX, int posY) {
	super(posX, posY);

	/* Le carre a besoin d'une matrice de 2x2: */
	mat = new Matrix(2);

	/* Couleur aleatoire: */
	int couleur = (int) (Math.random() * 4);
	
	// Le dernier parametre passe est la couleur:
	mat.setVal(0, 0, couleur);
	mat.setVal(1, 0, couleur);
	mat.setVal(0, 1, couleur);
	mat.setVal(1, 1, couleur);
}
}