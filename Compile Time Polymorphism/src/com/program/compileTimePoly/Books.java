package com.program.compileTimePoly;

public class Books {
		public void getBooks() {
			System.out.println("Book 1");
		}
		public void getBooks(String nameBook) {
		
			System.out.println(nameBook);
		}
		public void getBooks(String nameBooks, int prise) {
			System.out.println(nameBooks+" "+prise);
		}
}
