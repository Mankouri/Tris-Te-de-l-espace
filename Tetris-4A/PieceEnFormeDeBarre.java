/**
 * Piece de type: forme en '|' (barre).
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */
public class PieceEnFormeDeBarre extends Piece {
/**
 * Constructeur de la piece en forme de barre.
 * @param posX L'abcsisse de la piece dans le Canvas;
 * @param posY : L'ordonnee de la piece dans le Canvas.
 */
public PieceEnFormeDeBarre(int posX, int posY) {
	super(posX, posY);

	/* La barre a besoin d'une matrice de 4x4: */
	mat = new Matrix(4);

	/* Couleur aleatoire: */
	int couleur = (int) (Math.random() * 4);
	
	/* On dessine la barre: */
	mat.setVal(2, 0, couleur);
	mat.setVal(2, 1, couleur);
	mat.setVal(2, 2, couleur);
	mat.setVal(2, 3, couleur);
}
/**
 * Surcharge de l'operateur de rotation afin de permettre une rotation intuitive.
 * @param sens boolean
 */
public void rotation(boolean sens) {
	mat.transpose();
}
}