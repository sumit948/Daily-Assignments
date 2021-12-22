package com.program.ownAnnotation;

import org.junit.Test;

public class OwnAnnotationTesting {
	@OwnAnnotation //this is my created annotation
	@Test
	public void first() {
		System.out.println("This is my First Annotation");
	}
		
}
