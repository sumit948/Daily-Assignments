package com.program.files;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		//File f = new File("C:\\Users\\sumit\\Downloads","SumitMohite.txt");
		File f = new File("C:\\Users\\sumit\\eclipse(Enterprise&Web)-workspace\\File Handling\\src\\com\\program\\files","Sample.txt");
		System.out.println("File Name = "+f.getName());
        System.out.println("Parent Name = "+f.getParent());
        System.out.println("Full Path = "+f.getPath());
        System.out.println("AbsolutePath ="+f.getAbsolutePath());
        System.out.println("Is it a File: "+f.isFile());
        System.out.println("Is it a Directory: "+f.isDirectory());
        System.out.println("Length ="+f.length());
        System.out.println("Is the File Exists ="+f.exists());
	}

}
