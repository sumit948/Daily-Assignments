package com.programs.stringBuffer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StToken {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        String str = new String();
        int count=0;
        System.out.println("Enter a string");
        str = sc.nextLine();
        try {
        	StringTokenizer sToken = new StringTokenizer(str);
            while(sToken.hasMoreTokens())
            {
                System.out.println("Integer:"+sToken.nextToken());
                count+=Integer.parseInt(sToken.nextToken());
            }
            System.out.println("Total :"+count);
        }   
        catch(Exception e) {
        	System.out.println("Exception Handled");
        }
	}

}
