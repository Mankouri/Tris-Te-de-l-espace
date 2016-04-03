/**
 * Piece de type: frome en 'S' inversee.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
public class PieceEnFormeDeEsseInverse extends Piece {
/**
 * Constructeur de la piece en 'S' inverse.
 * @param posX Position X de la piece.
 * @param posY Position Y de la piece.
 */
public PieceEnFormeDeEsseInverse(int posX, int posY) {
	super(posX, posY);

	/* Le 'S' inverse tient dans une matrice 3x3: */
	mat = new Matrix(3);

	/* On choisit une couleur aleatoire: */
	int couleur = (int) (Math.random() * 4);	
	
	mat.setVal(0, 1, couleur);
	mat.setVal(1, 2, couleur);
	mat.setVal(2, 2, couleur);
}
}