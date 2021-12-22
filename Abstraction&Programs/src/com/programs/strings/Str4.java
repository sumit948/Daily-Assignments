package com.programs.strings;

public class Str4 {

	public static void main(String[] args) {
		
		String s1="Jhon Weak";
        String s2="Jh";
        String s3="ak";
        System.out.println("String 1 "+s1);
        System.out.println("String 1 "+s2);
        System.out.println("String 1 "+s3);
        System.out.println("String 1 Length "+s1.length());
        System.out.println("String 1 is begins with String 2: "+s1.startsWith(s2));
        System.out.println("String 1 is ends with String 3: "+s1.endsWith(s3));
        System.out.println("String 3 Position in Stirng 1: "+s1.indexOf(s2));
        System.out.println("String 1 Upper Case "+s1.toUpperCase());
        System.out.println("String 1 Lower Case "+s1.toLowerCase());
        
        
        String s4 = "Rock";
        System.out.println(s4.replace('o', 'e'));
        
        
        String s5="i love";
        String s6="my india";
        if((s6.compareTo(s5))>0)
            System.out.println("s6 is greater than s5");
        else if (s5.compareTo(s6)>0)
            System.out.println ("s5 is greater than s6");
        else
            System.out.println ("two strings are eqal");
        
        
        String s7="i love my ";
        String s8=s7.concat("india"); //merging string
        System.out.println(s8);
    
        
        String s9 = "Rajkumar";
        System.out.println(s9.substring(2,6)); //removeing from selected indexes

        
        String s10="       india      ";
        System.out.println(s10.trim());        //to remove extra spaces
	}

}
