package p1;

public class Derive extends Protect {
	Derive()
    {    System.out.println("Sub Constructor");
        System.out.println("Default"+n);
        //System.out.println("Private"+pri); // it is private variable in package p1
        System.out.println("Public"+pub);
        System.out.println("Protected"+pro);
    }
}
