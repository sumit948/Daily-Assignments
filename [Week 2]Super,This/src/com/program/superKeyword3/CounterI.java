package com.program.superKeyword3;

public class CounterI {
		int i = 1;
		CounterI increment(){
			i++;
			return this;
		}
		void display() {
			System.out.println("This is I: "+i);
		}
}
