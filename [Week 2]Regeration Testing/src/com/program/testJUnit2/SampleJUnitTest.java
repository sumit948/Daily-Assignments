package com.program.testJUnit2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class SampleJUnitTest extends TestResult{
	public synchronized  void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}
	 // add the failure
	   public synchronized void addFailure(Test test, AssertionFailedError t) {
	      super.addFailure((junit.framework.Test) test, t);
	   }
	 
	   @Test
	   public void testAdd() {
	       String name1,name2;
	       name1 = "Sumit";
	       name2 = "Sumit";
	       assertEquals(name1,"Sumit");
	   }

	   // Marks that the test run should stop.
	   public synchronized void stop() {
	      //stop the test here
		   System.out.println("It's Working");
	   }
	}

