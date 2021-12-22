package com.program.factorialUsingRecursion;

public class factRecursion {
			public static long fact(int num) {
				if(num<=1) {
					return 1;
				}
				else {
					return num*(fact(num-1));
				}
			}
	public static void main(String[] args) {
			for(int i=1;i<=5;i++) {
				System.out.println(fact(i));
			}

	}

}
