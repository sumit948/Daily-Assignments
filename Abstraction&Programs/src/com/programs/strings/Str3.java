package com.programs.strings;

public class Str3 {

	public static void main(String[] args) {
				  String s1 = "SVCE";
		          String s2 = s1;
		          String s5 = "SVCE";
		          String s3 = new String("SVCE");
		          String s4 = new String("SVCE");
		          System.out.println("== comparison : " + (s1 == s5));
		          System.out.println("== comparison : " + (s1 == s2));
		          System.out.println("Using equals method : "+ s1.equals(s2));
		          System.out.println("== comparison : " + s3 == s4);
		         System.out.println("Using equals method : " + s3.equals(s4));
	}

}
