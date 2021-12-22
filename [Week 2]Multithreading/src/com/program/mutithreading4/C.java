package com.program.mutithreading4;

public class C extends Thread {
	 int i;     public void run()
	    {    System.out.println("Thread C");
	        for(i=0;i<5;i++)
	        {    System.out.println("Thread C : "+i);
	        }
	    }
}
