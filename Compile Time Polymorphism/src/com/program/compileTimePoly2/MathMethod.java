package com.program.compileTimePoly2;

public class MathMethod {
	protected void m1() {
		System.out.println("initially 0");
	}
	protected void m1(int a) {
		System.out.println("SQRT: "+Math.sqrt(a));
	}
	protected void m1(int a, int b) {
		System.out.println("Sum: "+(a+b));
	}
	protected void m1(float a, int b) {
		System.out.println("Power: "+Math.pow(a, b));
	}
}
