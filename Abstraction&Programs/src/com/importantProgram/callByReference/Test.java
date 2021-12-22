package com.importantProgram.callByReference;

public class Test
{    int a,b;
    Test(int i,int j)		//passing references
    {    a=i;			
        b=j;
    }
    void meth( Test of) 
    {    of.a=a*2;
        of.b=b/2;
    }


    public static void main(String args [ ])
    {    Test t=new Test(4,5);
        System.out.println("Before calling a="+t.a+"b="+t.b);
        t.meth(t);
        System.out.println("After calling a="+t.a+"b="+t.b);
    }
}
