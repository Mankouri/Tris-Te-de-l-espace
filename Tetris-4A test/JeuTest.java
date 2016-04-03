import java.awt.Graphics;
import java.net.Socket;
import javax.swing.DebugGraphics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JeuTest</code> contains tests for the class <code>{@link Jeu}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:26
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class JeuTest {
	/**
	 * Run the Jeu(int,int,CanvasPieceSuivante) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testJeu_1()
		throws Exception {
		int width = 1;
		int height = 1;
		CanvasPieceSuivante cps = new CanvasPieceSuivante();

		Jeu result = new Jeu(width, height, cps);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getScore());
		assertEquals(false, result.play());
		assertEquals(1, result.getNiveau());
		assertEquals(0, result.getLigne());
		assertEquals(0, result.verifieLine());
	}

	/**
	 * Run the Jeu(int,int,CanvasPieceSuivante) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testJeu_2()
		throws Exception {
		int width = 1;
		int height = 0;
		CanvasPieceSuivante cps = new CanvasPieceSuivante();

		Jeu result = new Jeu(width, height, cps);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getScore());
		assertEquals(false, result.play());
		assertEquals(1, result.getNiveau());
		assertEquals(0, result.getLigne());
		assertEquals(0, result.verifieLine());
	}

	/**
	 * Run the Jeu(int,int,CanvasPieceSuivante) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testJeu_3()
		throws Exception {
		int width = 0;
		int height = 1;
		CanvasPieceSuivante cps = new CanvasPieceSuivante();

		Jeu result = new Jeu(width, height, cps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addUserPiece(Matrix) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testAddUserPiece_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Matrix mat = new Matrix(1);

		fixture.addUserPiece(mat);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDraw_2()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDraw_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 0, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDraw_4()
		throws Exception {
		Jeu fixture = new Jeu(0, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the int getLigne() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetLigne_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		int result = fixture.getLigne();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNiveau() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetNiveau_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		int result = fixture.getNiveau();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertEquals(0, result);
	}

	/**
	 * Run the int getScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetScore_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		int result = fixture.getScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertEquals(0, result);
	}

	/**
	 * Run the Piece getSuivante() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetSuivante_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		Piece result = fixture.getSuivante();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_2()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_4()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_5()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_6()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_7()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_8()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPositionPossible(Piece) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testIsPositionPossible_9()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Piece piece = new Piece(1, 1);

		boolean result = fixture.isPositionPossible(piece);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the void nouveauJeu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testNouveauJeu_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		fixture.nouveauJeu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void nouveauJeu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testNouveauJeu_2()
		throws Exception {
		Jeu fixture = new Jeu(0, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		fixture.nouveauJeu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void nouveauJeu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testNouveauJeu_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 0, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		fixture.nouveauJeu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the boolean play() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testPlay_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		boolean result = fixture.play();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean play() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testPlay_2()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		boolean result = fixture.play();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean play() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testPlay_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		boolean result = fixture.play();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the boolean play() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testPlay_4()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		boolean result = fixture.play();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertTrue(result);
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_2()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_4()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_5()
		throws Exception {
		Jeu fixture = new Jeu(0, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_6()
		throws Exception {
		Jeu fixture = new Jeu(0, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_7()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_8()
		throws Exception {
		Jeu fixture = new Jeu(0, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setHandicap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetHandicap_9()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int nbRangees = 1;

		fixture.setHandicap(nbRangees);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setNiveau(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetNiveau_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int niveau = 1;

		fixture.setNiveau(niveau);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = null;
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_2()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = null;
		boolean prevenirLAutre = false;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = null;
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_4()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = null;
		boolean prevenirLAutre = false;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_5()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = null;
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_6()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = null;
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_7()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket((Socket) null, true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = null;
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_8()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = new Socket();
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_9()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = new Socket();
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_10()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = new Socket();
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_11()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = new Socket();
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_12()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = new Socket();
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_13()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = new Socket();
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void setSocket(Socket,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetSocket_14()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		Socket socket = new Socket();
		boolean prevenirLAutre = true;

		fixture.setSocket(socket, prevenirLAutre);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 37;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_2()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 37;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 39;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_4()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 39;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_5()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 40;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_6()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 40;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_7()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 38;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testKey(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestKey_8()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));
		int code = 38;

		fixture.testKey(code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the void testScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		fixture.testScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
	}

	/**
	 * Run the int verifieLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testVerifieLine_1()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		int result = fixture.verifieLine();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertEquals(0, result);
	}

	/**
	 * Run the int verifieLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testVerifieLine_2()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		int result = fixture.verifieLine();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertEquals(0, result);
	}

	/**
	 * Run the int verifieLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testVerifieLine_3()
		throws Exception {
		Jeu fixture = new Jeu(1, 1, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		int result = fixture.verifieLine();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertEquals(0, result);
	}

	/**
	 * Run the int verifieLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testVerifieLine_4()
		throws Exception {
		Jeu fixture = new Jeu(1, 0, new CanvasPieceSuivante());
		fixture.setSocket(new Socket(), true);
		fixture.setNiveau(1);
		fixture.addUserPiece(new Matrix(1));

		int result = fixture.verifieLine();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at Jeu.setSocket(Jeu.java:368)
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JeuTest.class);
	}
}