package com.program.fileHandling.reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Test {

	public static void main(String[] args) throws IOException {
		File f = new File("/File Handling/src/com/program/fileHandling/reading","Sample1.txt");
		//File f = new File("C:\\Users\\sumit\\Downloads\\SumitMohite.txt");
		FileReader fR = new FileReader(f); 
		LineNumberReader lNR  = new LineNumberReader(fR);
		
		int i;
        String s;
        while ((s = lNR.readLine()) != null) {
            i = lNR.getLineNumber();
            System.out.println(i + " " + s);
        }

	}

}
