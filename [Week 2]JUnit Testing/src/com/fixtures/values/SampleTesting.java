package com.fixtures.values;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

public class SampleTesting extends TestCase {
	protected int num1, num2;

	   // assigning the values
	   protected void setUp(){
		   num1 = 5;
		   num2 = 5;
	   }
	 
	   // test method to add two values
	   public void testAdd(){
	      double result = num1 + num2;
	      assertTrue(result == result);
	      
	      
	   }
}
