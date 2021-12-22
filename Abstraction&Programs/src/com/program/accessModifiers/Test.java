package com.program.accessModifiers;

public class Test {

	public static void main(String[] args) {
		AccessModifiers d= new AccessModifiers(); // constructor
        d. x=10;
        d.setY(20);
        d.z=100;
        d.p=150;
        System.out.println("  "+d.x+"    "+d.z+"   "+d.p);

	}

}
