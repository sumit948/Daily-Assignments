package com.importantProgram.mathFunctions;

public class mathFunctions {

	public static void main(String[] args) {
		double x = 8;
        double y;
        System.out.println("Given Number "+x);
        y = Math.sqrt(x);
        System.out.println("Square Root : "+y);
        y = Math.pow(x,3);
        System.out.println("Power : "+y);
        y = Math.sin(x);
        System.out.println("Sine : "+y);
        y = Math.cos(x);
        System.out.println("Cosine : "+y);
        y = Math.log(x);
        System.out.println("Logrithm : "+y);
        y = Math.abs(x);
        System.out.println("Absolute Value : "+y);

	}

}
