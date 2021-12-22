package com.program.arrays;

public class Matrices {

	public static void main(String[] args) {
		int i,j,k;
		
		int[][] array1 = {{222},{222},{222}};
		int[][] array2 = {{222},{222},{222}};
		
		for(i=0;i<3;i++) {
			for( j=0;j<3;j++)
			{
				System.out.println(array1[i][j]);
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
			{
				System.out.println(array2[i][j]);
			}
		}
		
		System.out.println("Addition of Matrics");
		int sum[][] = new int[3][3];
		 for(i=0;i< 3;i++)
	        {    for(j=0;j< 3;j++)
	            {
	            sum[i][j] = array1[i][j] + array2[i][j];
	            System.out.print("\t" + sum[i][j]);
	            }
	            System.out.println("");
	        }
	}

}
