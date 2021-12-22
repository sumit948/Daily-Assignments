package com.program.testJUnit2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {

		Result result1 = JUnitCore.runClasses(SampleJUnitTest.class);
		
		for(Failure fail: result1.getFailures())
		{
			System.out.println(fail);
		}
		System.out.println("Check result: "+result1.wasSuccessful());
	}

}
