package com.program.Abstraction;

public class Test {

	public static void main(String[] args) {
		Book b = new Book();
		System.out.println("Hashcode is: "+b.hashCode());
		b.setBookName("The JungleBook");
		b.setBookAutor("Jhon Weak");
		System.out.println(b.getBookName()+" "+b.getBookAutor());

	}

}
