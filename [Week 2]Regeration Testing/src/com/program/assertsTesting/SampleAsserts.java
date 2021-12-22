package com.program.assertsTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SampleAsserts {
	@Test
	   public void testAdd() {
	      //test data
	      int num = 5;
	      String temp = "some"; //if it is null then will get assertion error
	      String str = "Junit is working fine";
	 
	      //check for equality
	      assertEquals("Junit is working fine", str);

	      //check for false condition
	      assertFalse(num > 7);
	      //will get Assertion Error
	 
	      //check for not null value
	      assertNotNull(temp);
	   }
}
