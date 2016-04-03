import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MatrixTest</code> contains tests for the class <code>{@link Matrix}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:26
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class MatrixTest {
	/**
	 * Run the Matrix(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testMatrix_1()
		throws Exception {
		int size = 1;

		Matrix result = new Matrix(size);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getSize());
	}

	/**
	 * Run the Matrix(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testMatrix_2()
		throws Exception {
		int size = 0;

		Matrix result = new Matrix(size);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getSize());
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
		Matrix fixture = new Matrix(1);

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
		Matrix fixture = new Matrix(1);
		int x = 1;
		int y = 1;

		int result = fixture.getVal(x, y);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getVal(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetVal_2()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = -1;
		int y = 1;

		int result = fixture.getVal(x, y);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getVal(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetVal_3()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = 1;
		int y = -1;

		int result = fixture.getVal(x, y);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getVal(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetVal_4()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = 1;
		int y = 1;

		int result = fixture.getVal(x, y);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getVal(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetVal_5()
		throws Exception {
		Matrix fixture = new Matrix(1);
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
		Matrix fixture = new Matrix(1);
		boolean sens = false;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_2()
		throws Exception {
		Matrix fixture = new Matrix(0);
		boolean sens = false;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_3()
		throws Exception {
		Matrix fixture = new Matrix(1);
		boolean sens = false;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_4()
		throws Exception {
		Matrix fixture = new Matrix(1);
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_5()
		throws Exception {
		Matrix fixture = new Matrix(1);
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_6()
		throws Exception {
		Matrix fixture = new Matrix(1);
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_7()
		throws Exception {
		Matrix fixture = new Matrix(1);
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_8()
		throws Exception {
		Matrix fixture = new Matrix(0);
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testRotation_9()
		throws Exception {
		Matrix fixture = new Matrix(0);
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Run the void setVal(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetVal_1()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = 1;
		int y = 1;
		int val = 1;

		fixture.setVal(x, y, val);

		// add additional test code here
	}

	/**
	 * Run the void setVal(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetVal_2()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = -1;
		int y = 1;
		int val = 1;

		fixture.setVal(x, y, val);

		// add additional test code here
	}

	/**
	 * Run the void setVal(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetVal_3()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = 1;
		int y = -1;
		int val = 1;

		fixture.setVal(x, y, val);

		// add additional test code here
	}

	/**
	 * Run the void setVal(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetVal_4()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = 1;
		int y = 1;
		int val = 1;

		fixture.setVal(x, y, val);

		// add additional test code here
	}

	/**
	 * Run the void setVal(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSetVal_5()
		throws Exception {
		Matrix fixture = new Matrix(1);
		int x = 1;
		int y = 1;
		int val = 1;

		fixture.setVal(x, y, val);

		// add additional test code here
	}

	/**
	 * Run the void transpose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTranspose_1()
		throws Exception {
		Matrix fixture = new Matrix(1);

		fixture.transpose();

		// add additional test code here
	}

	/**
	 * Run the void transpose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTranspose_2()
		throws Exception {
		Matrix fixture = new Matrix(1);

		fixture.transpose();

		// add additional test code here
	}

	/**
	 * Run the void transpose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTranspose_3()
		throws Exception {
		Matrix fixture = new Matrix(0);

		fixture.transpose();

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
		new org.junit.runner.JUnitCore().run(MatrixTest.class);
	}
}