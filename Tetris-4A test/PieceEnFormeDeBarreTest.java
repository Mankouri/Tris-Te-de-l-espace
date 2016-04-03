import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PieceEnFormeDeBarreTest</code> contains tests for the class <code>{@link PieceEnFormeDeBarre}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:24
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class PieceEnFormeDeBarreTest {
	/**
	 * Run the PieceEnFormeDeBarre(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:24
	 */
	@Test
	public void testPieceEnFormeDeBarre_1()
		throws Exception {
		int posX = 1;
		int posY = 1;

		PieceEnFormeDeBarre result = new PieceEnFormeDeBarre(posX, posY);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getSize());
		assertEquals(1, result.getPosY());
		assertEquals(1, result.getPosX());
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:24
	 */
	@Test
	public void testRotation_1()
		throws Exception {
		PieceEnFormeDeBarre fixture = new PieceEnFormeDeBarre(1, 1);
		fixture.posX = 1;
		fixture.mat = new Matrix(1);
		fixture.posY = 1;
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 03/04/16 11:24
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
	 * @generatedBy CodePro at 03/04/16 11:24
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
	 * @generatedBy CodePro at 03/04/16 11:24
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PieceEnFormeDeBarreTest.class);
	}
}