/**
 *   File Name: AppTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 27, 2016
 *   
 */

package org.junit.B38.Assertions10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class AssertMethTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass method will be executed before first test method starts");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass method will be executed after last test method completed");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Before method will execute before every test method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After method will execute after every test method");
	}
	
	@Test
	public void test_01_assertEquals_Positive() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_01_assertEquals_Positive");
		assertEquals("incorrect sum i + j", si.sumInt(), 25);
		}
	
	@Test
	public void test_02_assertEquals_Negative() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_02_assertEquals_Negative");
		assertEquals("incorrect sum i + j", si.sumInt(), si.sumInt() != 0);
		}

	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_03_assertEquals_Ignored");
		assertEquals("incorrect sum i + j", si.sumInt(), 25);
		}
	
	@Test
	public void test_04_AssertSame_Positive() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_04_AssertSame_Positive");
		assertEquals("not the same i & j", si.i, si.j);
		}
	
	@Test
	public void test_05_AssertSame_Negative() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_05_AssertSame_Negative");
		assertEquals("not the same i & 15", si.i, 0 !=  si.i );
		}
	
	@Ignore
	@Test
	public void test_06_AssertSame_Ignored() {
		System.out.println("Test_06_AssertSame_Ignored");
		}
	
	@Test
	public void test_07_assertFalse_Positive() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_07_assertFalse_Positive");
		assertFalse("it's true", si.logicAND());
		}
	
	@Test
	public void test_08_assertFalse_Negative() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_08_assertFalse_Negative");
		assertFalse("it's true", si.boolA);
		}
	
	@Test
	public void test_09_assertTrue_Positive() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_09_assertTrue_Positive");
		assertTrue("it's true", si.sumByte() == 13);	
	}
	
	@Test
	public void test_10_assertTrue_Negative() {
		AssertMeth si = new AssertMeth();
		System.out.println("Test_10_assertTrue_Negative");
		assertTrue("it's true", si.logicOR());
		}

}
