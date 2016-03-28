/**
 *   File Name: AppTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 27, 2016
 *   
 */

package org.junit.B38.Assertions10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * AppTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class AppTest2 {

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("BeforeClass method will be executed before first test method starts");
		}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("AfterClass method will be executed after last test method completed");
		}

	@Before
	public void before() throws Exception {
		System.out.println("Before method will execute before every test method");
		}

	@After
	public void after() throws Exception {
		System.out.println("After method will execute after every test method");
		}
	
	@Test
	public void test_01_assertEquals_Positive() {
		//assertEquals();
		System.out.println("Test_01_assertEquals_Positive");
		}
	
	@Test
	public void test_02_assertEquals_Negative() {
		System.out.println("Test_02_assertEquals_Negative");
		}

	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		System.out.println("Test_03_assertEquals_Ignored");
		}
	
	@Test
	public void test_04_AssertSame_Positive() {
		System.out.println("Test_04_AssertSame_Positive");
		}
	
	@Test
	public void test_05_AssertSame_Negative() {
		System.out.println("Test_05_AssertSame_Negative");
		}
	
	@Ignore
	@Test
	public void test_06_AssertSame_Ignored() {
		System.out.println("Test_06_AssertSame_Ignored");
		}
	
	@Test
	public void test_07_assertFalse_Positive() {
		System.out.println("Test_07_assertFalse_Positive");
		}
	
	@Test
	public void test_08_assertFalse_Negative() {
		System.out.println("Test_08_assertFalse_Negative");
		}
	
	@Test
	public void test_09_assertTrue_Positive() {
		System.out.println("Test_09_assertTrue_Positive");
		}
	
	@Test
	public void test_10_assertTrue_Negative() {
		System.out.println("Test_10_assertTrue_Negative");
		}
}
