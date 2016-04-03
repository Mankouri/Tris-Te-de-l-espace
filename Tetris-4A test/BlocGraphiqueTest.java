import java.awt.Color;
import java.awt.Graphics;
import javax.swing.DebugGraphics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BlocGraphiqueTest</code> contains tests for the class <code>{@link BlocGraphique}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:25
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class BlocGraphiqueTest {
	/**
	 * Run the BlocGraphique(Color,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:25
	 */
	@Test
	public void testBlocGraphique_1()
		throws Exception {
		Color couleur = new Color(1);
		int posX = 1;
		int posY = 1;

		BlocGraphique result = new BlocGraphique(couleur, posX, posY);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getPosY());
		assertEquals(1, result.getPosX());
	}

	/**
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:25
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		BlocGraphique fixture = new BlocGraphique(new Color(1), 1, 1);
		Graphics g = new DebugGraphics();

		fixture.draw(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.DebugGraphics.setColor(Unknown Source)
		//       at BlocGraphique.draw(BlocGraphique.java:35)
	}

	/**
	 * Run the int getPosX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:25
	 */
	@Test
	public void testGetPosX_1()
		throws Exception {
		BlocGraphique fixture = new BlocGraphique(new Color(1), 1, 1);

		int result = fixture.getPosX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getPosY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:25
	 */
	@Test
	public void testGetPosY_1()
		throws Exception {
		BlocGraphique fixture = new BlocGraphique(new Color(1), 1, 1);

		int result = fixture.getPosY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setPosX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:25
	 */
	@Test
	public void testSetPosX_1()
		throws Exception {
		BlocGraphique fixture = new BlocGraphique(new Color(1), 1, 1);
		int posX = 1;

		fixture.setPosX(posX);

		// add additional test code here
	}

	/**
	 * Run the void setPosY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:25
	 */
	@Test
	public void testSetPosY_1()
		throws Exception {
		BlocGraphique fixture = new BlocGraphique(new Color(1), 1, 1);
		int posY = 1;

		fixture.setPosY(posY);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 03/04/16 11:25
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
	 * @generatedBy CodePro at 03/04/16 11:25
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
	 * @generatedBy CodePro at 03/04/16 11:25
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BlocGraphiqueTest.class);
	}
}