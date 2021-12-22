
public class Test {

	public static void main(String[] args) {
	    {
            int x = 1;
            int y = 5, result=0;
            boolean b1 = true;
            if((x == 1) && (x < y))
            	System.out.println("value of x is "+x);
            	if((x == y) || (y > 1))
            		System.out.println("value of y is grater than the value of x");
            	result = b1 ? x : y;
            	System.out.println("The returned value is "+result);
       }

	}

}
