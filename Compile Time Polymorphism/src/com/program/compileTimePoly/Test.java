package com.program.compileTimePoly;

public class Test {

	public static void main(String[] args) {
		Books b = new Books();
		b.getBooks();
		b.getBooks("change");
		b.getBooks("Change", 500);

	}

}
