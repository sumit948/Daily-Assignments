
public class Test {

	public static void main(String[] args) {
		  A a = new A();
          B b = new B();
          C c = new C();
          if(a instanceof A)
              System.out.println("a is instance of A");
          A obj;
          obj = c; // A reference to C
          if(obj instanceof C)
              System.out.println("obj is instance of C");

	}

}
