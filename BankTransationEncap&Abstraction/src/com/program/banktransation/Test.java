package com.program.banktransation;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		BankTransation bt = new BankTransation();
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("1.enquiery");
		System.out.println("2.deposite");
		System.out.println("3.withdraw");
		while(true) {
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: bt.enquiery();
					break;
			case 2: bt.deposite();
					break;
			case 3: bt.withdraw();
					break;
			default: return;
			}
		}
	
	}
//		{
//		      int x=4;
//          int y=6;
//          int z=10;
//          int rs=0;
//          rs = x + y;
//          System.out.println("The addition of (x+y):"+ rs);
//          rs  = y - x;
//          System.out.println("The subtraction of (y-x):"+ rs);
//          rs = x * y;
//          System.out.println("The multiplication of (x*y):"+ rs);
//          rs = y / x;
//          System.out.println("The division of (y/x):"+ rs);
//          rs = x + (y * (z/x));
//          System.out.println("The result is now :"+ rs);
//      
//}
}