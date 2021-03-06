import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PieceEnFormeDeCarreTest</code> contains tests for the class <code>{@link PieceEnFormeDeCarre}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:24
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class PieceEnFormeDeCarreTest {
	/**
	 * Run the PieceEnFormeDeCarre(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:24
	 */
	@Test
	public void testPieceEnFormeDeCarre_1()
		throws Exception {
		int posX = 1;
		int posY = 1;

		PieceEnFormeDeCarre result = new PieceEnFormeDeCarre(posX, posY);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getSize());
		assertEquals(1, result.getPosY());
		assertEquals(1, result.getPosX());
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
		new org.junit.runner.JUnitCore().run(PieceEnFormeDeCarreTest.class);
	}
}