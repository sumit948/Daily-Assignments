package com.program.assertsandimpementstest;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestResult;

public class TestCase2 extends SampleTest {
	protected double num1;
	protected double num2;

	@Before
	public void SetUp() {
		num1 = 2.4;
		num2 = 2.2;
	}
	@Test
	public void addTest() {
		System.out.println("Count Test: "+(this.countTestCases()));
	}
		
	@Override
	public int countTestCases() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void run(TestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}
	
