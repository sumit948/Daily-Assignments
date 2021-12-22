package com.program.swap;

public class SwapNo {
	int a=10,b=20;
	public void swapWitoutThird() {
		a = a+b;
		b= a-b;
		a=a-b;
	}
	public void SwapWithThird() {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	public void display() {
		System.out.println("value of a: "+a+"value of b: "+b);
	}
}
