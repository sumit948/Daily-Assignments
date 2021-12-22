package com.program.compileTime.Dispatch;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A r; //obtain reference type A
		
		r =a;
		r.diplay();
		
		r=b;
		r.diplay();
		
		r=c;
		r.diplay();
	}

}
