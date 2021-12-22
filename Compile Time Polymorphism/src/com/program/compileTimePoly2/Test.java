package com.program.compileTimePoly2;

public class Test {

	public static void main(String[] args) {
		MathMethod m = new MathMethod();
		m.m1();
		m.m1(5);
		m.m1(5, 2);
		m.m1(1000, 1);
	}

}
