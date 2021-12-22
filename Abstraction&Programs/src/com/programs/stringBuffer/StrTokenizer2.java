package com.programs.stringBuffer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTokenizer2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a string");
        str = s.nextLine();
        StringTokenizer stzer = new StringTokenizer(str);
        System.out.println("Total number words:"+stzer.countTokens());  //pass jhon weak -> 2
        
        
        String Demo = "This is a string that we want to tokenize";
        StringTokenizer Tok = new StringTokenizer(Demo);
         int n=0;
         while (Tok.hasMoreElements())
         System.out.println("" + n++ +": "+Tok.nextElement());
         
         
         String st1=new String("27/9/1990:4-4-727:a");
         StringTokenizer st=new StringTokenizer(st1,"/:");
         System.out.println("TotalTokens:"+st.countTokens());
         while(st.hasMoreTokens())
         {
             System.out.println("  "+st.nextToken());
             
         }

	}

}
