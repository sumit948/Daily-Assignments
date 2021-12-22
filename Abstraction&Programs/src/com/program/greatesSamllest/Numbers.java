package com.program.greatesSamllest;

class Numbers
{    public static void main(String args[ ]) 
    {    int i,great_no,small_no;
        int no[ ] = {5,78,1,6,74,9,6,4,6,7};
        System.out.println("Elements in the Array : ");
        for(i=0;i< 10;i++)
        System.out.print(no[i]+"\t");
        great_no = no[0]; small_no = no[0];
        for(i=1;i< 10;i++)
        {    if(great_no< no[i])
                great_no = no[i];
            else if(small_no>no[i])
                small_no = no[i];
        }
        System.out.print("\nGreatest Number : "+great_no);
        System.out.print("\nSmallest Number : "+small_no);
	
//			int n = 15;
//			int sum = 0;
//			for(int i = n;i>=0;i--)
//			sum = sum + i;
//			System.out.println("Sum = "+ sum);
    }
}
