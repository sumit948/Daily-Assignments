package com.program.thisKey;

public class Test {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
        rectangle.show(5,6);
        int area = rectangle.calculate();
        System.out.println("The area of a Rectangle is  :  " + area);

	}

}
