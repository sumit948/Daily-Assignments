package com.programs.strings;

import java.io.IOException;

public class StrReadChar {

	public static void main(String[] args) throws IOException {
		char c;
        System.out.println("Enter a character");
        c = (char)System.in.read();
        System.in.read();
        System.out.println("You entered " + c);

	}

}
