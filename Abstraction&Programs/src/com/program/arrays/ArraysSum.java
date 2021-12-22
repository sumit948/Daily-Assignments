package com.program.arrays;

import java.util.Scanner;

public class ArraysSum {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//        int sum =0;
//        for(int i=0;i<10;i++) {
//            System.out.println("Please Enter Number "+ (i+1));
//            int num = sc.nextInt();
//            sum = sum+num;
//        }
//        System.out.println("The Final Result is : "+sum);	
//        
		int sum= 0;
		for(int i=0; i<args.length;i++) {
			sum+= Integer.parseInt(args[i]);
		}
		System.out.println(sum); //run config -> Arguments
	}

}
