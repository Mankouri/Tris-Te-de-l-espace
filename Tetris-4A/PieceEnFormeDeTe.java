/**
 * Piece de type: forme en T.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
 
public class PieceEnFormeDeTe extends Piece {
/**
 * Constructeur de la piece en 'T'.
 * @param posX Position X de la piece.
 * @param posY Position Y de la piece.
 */

public PieceEnFormeDeTe(int posX, int posY) {
	super(posX, posY);

	/* Le 'T' tient dans une matrice 3x3: */
	mat = new Matrix(3);

	/* On choisit une couleur al�atoire: */
	int couleur = (int) (Math.random() * 4);	

	/* Dessine la forme d'un 'T' dans la matrice: */
	mat.setVal(1, 0, couleur);
	mat.setVal(1, 1, couleur);
	mat.setVal(1, 2, couleur);
	mat.setVal(2, 1, couleur);
}
}