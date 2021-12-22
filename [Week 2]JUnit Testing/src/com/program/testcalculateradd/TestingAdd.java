package com.program.testcalculateradd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingAdd {
	@Test
	public void testAdd() {
	Calculator c1=new Calculator();
	int expectedresult=8;
	assertEquals(expectedresult,c1.add(3,5));
	}
	@Test
	public void testSub() {
		Calculator c1 = new Calculator();
		int result = c1.sub(10, 5);
		assertEquals(5,result);
	}
}
