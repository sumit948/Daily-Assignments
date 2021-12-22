package com.importantProgram.blocks;

public class blocks {

	     public static void main(String [ ]args)
       {
           AAA:
           {   
               System.out.println("Block AAA");
           BBB:
           {    
                     System.out.println("Block BBB");
           CCC:
           {     
               if(true)
                   break BBB;
           }
           System.out.println("Out of Block CCC");
              }
           System.out.println("Out of Block BBB");
           }
           System.out.println("Out of Block AAA");
       }
   }
