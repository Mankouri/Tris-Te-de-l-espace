/**
 * Piece de type: forme en 'L' inversee.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
public class PieceEnFormeDeElleInverse extends Piece {
/**
 * Constructeur de la piece en 'L' inverse.
 * @param posX Position X de la piece.
 * @param posY Position Y de la piece.
 */
public PieceEnFormeDeElleInverse(int posX, int posY) {
	super(posX, posY);

	/* Le 'L' inverse tient dans une matrice 3x3: */
	mat = new Matrix(3);

	/* On choisit une couleur aleatoire: */
	int couleur = (int) (Math.random() * 4);	
	
	/* Dessine la forme d'un 'L' inverse dans la matrice: */
	mat.setVal(1, 0, couleur);
	mat.setVal(1, 1, couleur);
	mat.setVal(1, 2, couleur);
	mat.setVal(0, 2, couleur);
}
}