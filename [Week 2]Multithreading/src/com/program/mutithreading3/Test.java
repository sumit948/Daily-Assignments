package com.program.mutithreading3;

public class Test {

	public static void main(String[] args) {
		Mythread m1 = new Mythread();
		m1.start();
		System.out.println("This is mainThread");
	}

}
