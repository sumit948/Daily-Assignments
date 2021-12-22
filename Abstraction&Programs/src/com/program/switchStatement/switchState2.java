package com.program.switchStatement;

public class switchState2 {

	public static void main(String[] args) {
		int a= 10, b=20, c=30;
		int status=-1;
		if(a>b&&a>c) {
			status=1;
		}
		else if(b>c) {
			status=2;
		}
		else {
			status=3;
		}
		switch(status) {
		case 1: System.out.println("a is greate");break;
		case 2: System.out.println("b is greate");break;
		case 3: System.out.println("c is greate");break;
		default: System.out.println("Error!!");
		}

	}

}
