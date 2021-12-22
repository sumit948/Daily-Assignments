package com.program.UneryOperators;

public class UneryOperator {

	public static void main(String[] args) {
		int number = 1;
        int number1 = 0;
        System.out.println("First number:" +number);
        
        number = -number;
        System.out.println("after preSubstitute:" +number);
        ++number;
        System.out.println("Preincrement:" +number);
        number1=number++;
        System.out.println("Postincreament:" +number);
        System.out.println("value of number1 is:" +number1);
        
        boolean result = (2>1);
        System.out.println("2 is geater than 1: "+result);
        System.out.println("2 is geater than 1: "+!result);
     

	}
	
	/*
	 * class Count
{
        public static void main (String args[ ])
        {
            for (int i = 0; i < 50; i++)
          {
                System.out.println(i);
              }
         }
}
//java has decrement operators
class Count
{
       public static void main (String args[ ])
        {
              for (int i = 50; i > 0; i--)
              {     System.out.println(i);
              }

        }
}*/

	}


