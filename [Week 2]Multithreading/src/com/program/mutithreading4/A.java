package com.program.mutithreading4;
import java.util.*;
public class A extends Thread {
	 int i;     public void run()
	    {    System.out.println("Thread A");
	        for(i=0;i<5;i++)
	        {    System.out.println("Thread A : "+i);
	       
	        }
	    }
}
