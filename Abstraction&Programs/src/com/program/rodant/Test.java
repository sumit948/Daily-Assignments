package com.program.rodant;

public class Test {

	public static void main(String[] args) {
		Rodant r[ ]=new Rodant[3];
        r[0]=new Mouse();
       r[1]=new Gerbil();
        r[2]=new Hamster();
       r[0].eat();
       r[1].eat();
       r[2].eat();
	}

}
