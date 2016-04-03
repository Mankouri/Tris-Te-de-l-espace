/**
 * Piece de type: forme en 'S'.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
 
public class PieceEnFormeDeEsse extends Piece {
/**
 * Constructeur de la piece en 'S'.
 * @param posX Position X de la piece.
 * @param posY Position Y de la piece.
 */

public PieceEnFormeDeEsse(int posX, int posY) {
	super(posX, posY);

	/* Le 'S' tient dans une matrice 3x3: */
	mat = new Matrix(3);

	/* On choisit une couleur aleatoire: */
	int couleur = (int) (Math.random() * 4);	
	
	/* Dessine la forme d'un 'S' dans la matrice: */
	mat.setVal(1, 1, couleur);
	mat.setVal(2, 1, couleur);
	mat.setVal(0, 2, couleur);
	mat.setVal(1, 2, couleur);
}
}