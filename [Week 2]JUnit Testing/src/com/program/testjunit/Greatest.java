package com.program.testjunit;

public class Greatest {
	public static int greatest(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }
 
    public int addtion(int x, int y) {
        return x + y;
    }
 
    public int subtraction(int x, int y) {
        return x - y;
    }
 
    public int multiplication(int x, int y) {
        return x * y;
    }
 
    public int division(int x, int y) {
        return x / y;
    }
 
    public int module(int x, int y) {
        return x % y;
    }
}

