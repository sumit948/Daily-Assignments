package com.program.mutithreading3;

public class Mythread extends Thread {
		
	int i=0;
    public void run()
    {    for(;i<=10;i++)
        {    try{ sleep(700); }
            catch(Exception e) { }           
            System.out.println (i);
        }
    }
}
