import java.awt.event.ActionEvent;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FrameBestScoreTest</code> contains tests for the class <code>{@link FrameBestScore}</code>.
 *
 * @generatedBy CodePro at 03/04/16 11:26
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class FrameBestScoreTest {
	/**
	 * Run the FrameBestScore() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testFrameBestScore_1()
		throws Exception {

		FrameBestScore result = new FrameBestScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the FrameBestScore() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testFrameBestScore_2()
		throws Exception {

		FrameBestScore result = new FrameBestScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the FrameBestScore(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testFrameBestScore_3()
		throws Exception {
		int score = 1;
		int niveau = 1;
		int ligne = 1;

		FrameBestScore result = new FrameBestScore(score, niveau, ligne);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertNotNull(result);
	}

	/**
	 * Run the FrameBestScore(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testFrameBestScore_4()
		throws Exception {
		int score = 1;
		int niveau = 1;
		int ligne = 1;

		FrameBestScore result = new FrameBestScore(score, niveau, ligne);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertNotNull(result);
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the int getColNewScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetColNewScore_1()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		int result = fixture.getColNewScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLigneInsertion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetLigneInsertion_1()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		int result = fixture.getLigneInsertion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int getLigneNewScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testGetLigneNewScore_1()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		int result = fixture.getLigneNewScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_1()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_2()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_3()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_4()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_5()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_6()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_7()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_8()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_9()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_10()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_11()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_12()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_13()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_14()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_15()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void initData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testInitData_16()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.initData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_1()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_2()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_3()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_4()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_5()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_6()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_7()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_8()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_9()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_10()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_11()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_12()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_13()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_14()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_15()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the void saveFichier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testSaveFichier_16()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);

		fixture.saveFichier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_1()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_2()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_3()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_4()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_5()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_6()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_7()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
		assertEquals(0, result);
	}

	/**
	 * Run the int testScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 03/04/16 11:26
	 */
	@Test
	public void testTestScore_8()
		throws Exception {
		FrameBestScore fixture = new FrameBestScore(1, 1, 1);
		int score = 1;

		int result = fixture.testScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at FrameBestScore.initData(FrameBestScore.java:334)
		//       at FrameBestScore.<init>(FrameBestScore.java:197)
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
		new org.junit.runner.JUnitCore().run(FrameBestScoreTest.class);
	}
}