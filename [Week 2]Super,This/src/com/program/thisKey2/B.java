package com.program.thisKey2;

public class B extends A {
	int i;         // this i hides the i in A
    B(int a, int b)
    {    super.i = a;     // i in A
            i = b;         // i in B
      }
    void show()
    {        System.out.println("i in superclass: " + super.i);
            System.out.println("i in subclass: " + i);
      }
}
