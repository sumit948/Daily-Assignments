package com.program.testAssertes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAritmetic {
	@Test
	public void testForFindSqrt() {
		Aritmetic instance = new Aritmetic();
		double expResult = 2.5;
		double result = instance.findSquareRoot(6.25);   
		assertEquals(expResult, result,0);
		}}
