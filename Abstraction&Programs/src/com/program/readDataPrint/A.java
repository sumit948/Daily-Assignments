package com.program.readDataPrint;

import java.util.Scanner;

public class A {
	int x,y;
    void readdata()
    {    Scanner s=new Scanner(System.in);
    	System.out.println("Enter for x: ");
        x=s.nextInt();
        System.out.println("Enter for y: ");
        y=s.nextInt();
    }
    void printdata()
    {    System.out.println("x="+x+"\n"+"y="+y);
    }
}
