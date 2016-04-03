import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UserPieceTest</code> contains tests for the class <code>{@link UserPiece}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:26
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class UserPieceTest {
	/**
	 * Run the UserPiece(int,int,Matrix) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testUserPiece_1()
		throws Exception {
		int posX = 1;
		int posY = 1;
		Matrix mat = new Matrix(1);

		UserPiece result = new UserPiece(posX, posY, mat);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getSize());
		assertEquals(1, result.getPosY());
		assertEquals(1, result.getPosX());
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
		new org.junit.runner.JUnitCore().run(UserPieceTest.class);
	}
}