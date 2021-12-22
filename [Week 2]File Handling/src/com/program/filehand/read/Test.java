package com.program.filehand.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		// Open input/output and setup variables
        FileReader fr = new FileReader(args[0]);
              PrintWriter pw = new PrintWriter(System.out, true);
        char c[ ] = new char[4096];
        int read = 0;     // Read (and print) till end of file
        while ((read = fr.read(c)) != -1)
           pw.write(c, 0, read);     // Close shop
        fr.close();
        pw.close();

	}

}
