import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("football1.xml");
		Football fb = (Football) appContext.getBean("kaka");
		System.out.println(fb);

	}

}
