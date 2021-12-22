package com.program.constructorJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest {
	String message = "Hello World";   
	SampleConstructor messageUtil = new SampleConstructor(message);
	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }
}
