import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("NewPOM.xml");
		Employee employee = (Employee)applicationContext.getBean("employee1");
		System.out.println(employee);

	}

}
