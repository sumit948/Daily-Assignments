package com.programs.stringBuffer;

import java.util.StringTokenizer;

public class StrTokenizer {

	public static void main(String[] args) {
		int sum=0;
        String s1="This is good for none";
        StringTokenizer st1=new StringTokenizer(s1);
        System.out.println("No. of Words "+st1.countTokens());
         sum=st1.countTokens()-1;
        while(st1.hasMoreTokens())
         sum=sum+st1.nextToken().length();
       System.out.println("No. of Chars "+sum);
	}

}
