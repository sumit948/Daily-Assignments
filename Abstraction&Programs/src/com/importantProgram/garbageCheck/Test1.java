package com.importantProgram.garbageCheck;

public class Test1 {

	public static void main(String[] args) {
		int SIZE = 200;
        StringBuffer s;
        for (int i = 0; i < SIZE; i++){    }
        System.out.println("Garbage Collection started explicitly.");
        long time = System.currentTimeMillis();
        System.gc();
        System.out.println("It took " + (System.currentTimeMillis()-time) + " ms");
	}

}
