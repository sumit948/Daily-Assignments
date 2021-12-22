package com.program.construtors;

public class Test {

	public static void main(String[] args) {
		 Constructors c1=new Constructors(); //explicit call to default cons.
		 Constructors c2=new Constructors(5); //explicit call to parameterized cons.
		 Constructors c3=new Constructors(1,2,3); //explict call to parameterized cons.
		 Constructors c4=new Constructors(c3); //implicit call to copy cons.
		 Constructors d = c2; //copy constructors
         c1.sum(); c2.sum();
         c3.sum(); c4.sum();

	}

}
