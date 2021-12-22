package com.program.arrays;

public class arrayTest {

	public static void main(String[] args) {
		int[] a = new int[2];
		for(int i =0;i<a.length;i++) {
			a[i] = i;
		}
		int sum = 0;
		for(int i=0;i<=a.length;i++) {
			sum+=i;
		}
		System.out.println(sum); //1+2

	}

}
