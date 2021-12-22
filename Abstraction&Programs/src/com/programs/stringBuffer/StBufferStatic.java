package com.programs.stringBuffer;

import java.util.Scanner;

public class StBufferStatic {
		static String s;
	public static void main(String[] args) {
		s = new String();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("java");
        StringBuffer sb3 = new StringBuffer(40);
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a string");
        s = scn.nextLine();   
        System.out.println("  "+s);
        System.out.println("length:"+s.length());
        System.out.println("capacity:"+sb1.capacity());
        System.out.println("capacity:"+sb2.capacity());
        System.out.println("capacity:"+sb3.capacity());

	}

}
