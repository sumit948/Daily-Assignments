package com.program.testJUnit2;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {
	public static void main(String[] args) {
		TestSuite ts = new TestSuite(SampleJUnitTest.class,TestRunner.class);
		TestResult tr = new TestResult();
		ts.run(tr);
		System.out.println("Number of failuer count: "+tr.failureCount());
		System.out.println("Number of error count: "+tr.errorCount());
		System.out.println("Number of run count: "+tr.runCount());
	}
}
