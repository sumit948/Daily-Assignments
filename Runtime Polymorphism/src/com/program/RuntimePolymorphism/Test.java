package com.program.RuntimePolymorphism;

public class Test {

	public static void main(String[] args) {
		SampleA a = new SampleA();
		a.sameFunction(11);
		System.out.println(a);
		SampleA b = new SampleB();
		System.out.println(b);
	}

}
