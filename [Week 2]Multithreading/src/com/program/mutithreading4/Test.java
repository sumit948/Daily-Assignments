package com.program.mutithreading4;

public class Test {

	public static void main(String[] args) {
		A a = new A(); 
		B b = new B();     
		C c = new C();
        a.start(); 
        b.start(); 
        c.start();

	}

}
