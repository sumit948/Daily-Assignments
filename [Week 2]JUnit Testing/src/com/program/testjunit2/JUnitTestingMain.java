package com.program.testjunit2;

import org.junit.Test;

public class JUnitTestingMain {
	SampleExample se = new SampleExample();
	@Test
	public void testOne() {
		se.beforeClassMethod();
	}
}
