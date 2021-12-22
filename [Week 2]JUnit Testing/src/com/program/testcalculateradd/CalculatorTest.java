package com.program.testcalculateradd;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class CalculatorTest {
	@Before
	public void setUp() {
		int value1 = 3;
		int value2 = 5;
		System.out.println("SetUp is Done!!");
	}
	
	@After
	public void tearDown() {
		System.out.println("Yes done with TearDown");
	}
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("SetUpClass is done!");
	}
}
//NO NEED OF THIS CLASS