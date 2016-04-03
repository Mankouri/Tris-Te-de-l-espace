/**
 * Piece de type: forme en 'L'.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
 
public class PieceEnFormeDeElle extends Piece {
/**
 * Constructeur de la piece en 'L'.
 * @param posX Position X de la piece.
 * @param posY Position Y de la piece.
 */

public PieceEnFormeDeElle(int posX, int posY) {
	super(posX, posY);

	/* Le 'L' tient dans une matrice 3x3: */
	mat = new Matrix(3);

	/* On choisit une couleur al�atoire: */
	int couleur = (int) (Math.random() * 4);
	
	/* Dessine la forme d'un 'L' dans la matrice: */
	mat.setVal(1, 0, couleur);
	mat.setVal(1, 1, couleur);
	mat.setVal(1, 2, couleur);
	mat.setVal(2, 2, couleur);
}
}