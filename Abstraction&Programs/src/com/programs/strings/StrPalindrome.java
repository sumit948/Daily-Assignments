package com.programs.strings;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String s1= new String();
        System.out.println("Enter a string");
        s1 = s.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        if(sb.toString().equals(s1))
            System.out.println("given String is Palindrome");
        else
            System.out.println("given string is not Palindrome");
	}

}
