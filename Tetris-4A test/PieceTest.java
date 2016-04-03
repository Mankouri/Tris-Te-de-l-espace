import java.awt.Graphics;
import javax.swing.DebugGraphics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PieceTest</code> contains tests for the class <code>{@link Piece}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:26
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class PieceTest {
	/**
	 * Run the Piece(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testPiece_1()
		throws Exception {
		int posX = 1;
		int posY = 1;

		Piece result = new Piece(posX, posY);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getPosY());
		assertEquals(1, result.getPosX());
	}

	/**
	 * Run the void down() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDown_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);

		fixture.down();

		// add additional test code here
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
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
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
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
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
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
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
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(0);
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
	}

	/**
	 * Run the void drawSuivante(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDrawSuivante_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		Graphics g = new DebugGraphics();

		fixture.drawSuivante(g);

		// add additional test code here
	}

	/**
	 * Run the void drawSuivante(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDrawSuivante_2()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		Graphics g = new DebugGraphics();

		fixture.drawSuivante(g);

		// add additional test code here
	}

	/**
	 * Run the void drawSuivante(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDrawSuivante_3()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		Graphics g = new DebugGraphics();

		fixture.drawSuivante(g);

		// add additional test code here
	}

	/**
	 * Run the void drawSuivante(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testDrawSuivante_4()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(0);
		Graphics g = new DebugGraphics();

		fixture.drawSuivante(g);

		// add additional test code here
	}

	/**
	 * Run the int getPosX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetPosX_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);

		int result = fixture.getPosX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getPosY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetPosY_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);

		int result = fixture.getPosY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);

		int result = fixture.getSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getVal(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetVal_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		int x = 1;
		int y = 1;

		int result = fixture.getVal(x, y);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void translation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTranslation_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		boolean sens = false;

		fixture.translation(sens);

		// add additional test code here
	}

	/**
	 * Run the void translation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTranslation_2()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);
		boolean sens = true;

		fixture.translation(sens);

		// add additional test code here
	}

	/**
	 * Run the void up() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testUp_1()
		throws Exception {
		Piece fixture = new Piece(1, 1);
		fixture.mat = new Matrix(1);

		fixture.up();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(PieceTest.class);
	}
}