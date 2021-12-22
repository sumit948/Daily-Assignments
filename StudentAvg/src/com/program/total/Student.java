package com.program.total;

import java.util.Scanner;

public class Student {
	private int i,no,avg,total;
	private int[] arr = new int[10];
	String s;
	Scanner sc = new Scanner(System.in);
	public void read() {
		System.out.println("Enter name: ");
		s= sc.nextLine();
		System.out.println("Enter Id: ");
		no = sc.nextInt();
		System.out.println("Enter 6 Subject Marks: ");
		for(i=0;i<6;i++) {
			arr[i] = sc.nextInt();
		}
	}
	public void calculate() {
		for(i=0;i<6;i++) {
			total += arr[i];
			avg=(total/6);
		}
	}
	public void display() {
		System.out.println("Name Of Student is: "+s);
		System.out.println("Id Of Student is: "+no);
		System.out.println("Avg marks is: "+avg);
		System.out.println("Total marks is: "+total);
	}
}
