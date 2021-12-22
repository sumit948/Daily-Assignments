package com.program.testjunit2;

import org.junit.Before;
import org.junit.Test;

public class SampleExample {
	@Before
	public static void beforeClassMethod() {
		System.out.println("In Before Class");
	}
	@Test
	public void testing() {
		System.out.println("In Testing");
	}
}
