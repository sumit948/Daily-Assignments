package com.program.usingContinue;

public class Test {

	public static void main(String[] args) {
		System.out.println("Even Numbers");
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				continue; //rest of the loop will skip
			}
			else {
				System.out.println("Odd");
			}
		}

	}

}
