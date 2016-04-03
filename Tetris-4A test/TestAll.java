

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 03/04/16 11:26
 * @author ange__000
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	JeuTest.class,
	PieceEnFormeDeBarreTest.class,
	PieceEnFormeDeEsseInverseTest.class,
	SwingConstantsTest.class,
	FrameBestScoreTest.class,
	PieceEnFormeDeTeTest.class,
	ServeurTest.class,
	ClientTest.class,
	UserPieceTest.class,
	CouleurTest.class,
	PieceTest.class,
	MatrixTest.class,
	PieceEnFormeDeElleInverseTest.class,
	PieceEnFormeDeElleTest.class,
	PieceEnFormeDeCarreTest.class,
	PieceEnFormeDeEsseTest.class,
	BlocGraphiqueTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}