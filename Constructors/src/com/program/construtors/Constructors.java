package com.program.construtors;

public class Constructors {
	int x=10,y=20,z=30;
		Constructors(){
			System.out.println("Default");
		}
		Constructors(int a){
			x=a;
			System.out.println("Parametraised");
		}
		Constructors(int a,int b,int c){
			x=a;
			y=b;
			z=z;
			System.out.println("Parametraised");
		}
		Constructors(Constructors p){
			x= p.x;
			y= p.y;
			z= p.z;
		}
		public void sum() {
			System.out.println("Sum: "+(x+y+z));
			
		}
}
