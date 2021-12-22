package p1;

public class Protect {
	int n=1;
    private int pri=2;
    public  int pub=3;
    protected int pro=4;
    public Protect()
    {    System.out.println("Super Constructor");
        System.out.println("Default"+n);
        System.out.println("Private"+pri);
        System.out.println("Public"+pub);
        System.out.println("Protected"+pro);
    }
}
