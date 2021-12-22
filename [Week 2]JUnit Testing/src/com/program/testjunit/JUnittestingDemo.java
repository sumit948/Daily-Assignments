package com.program.testjunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnittestingDemo {
	Greatest g = new  Greatest();
	@Test
    public void myTest() {
        //assertEquals(10, 10);
        assertEquals("hello", "hello");
    }
	@Test
    public void myTestForDivision() {
		int result = g.division(12, 2);
        assertEquals(6, result);
    }
	
	@Test
    public void myTestForMultiplication() {
		int result = g.multiplication(10, 10);
        assertEquals(100, result);
    }
	
	@Test
	public void myTestForGreatest() {
	     int check  = g.greatest(5, 4, 7);
	     assertEquals(7,check);
	}
	
	@Test
	public void myTestForModulo() {
	     int check  = g.module(10, 2);
	     assertEquals(0,check);
	}
}
