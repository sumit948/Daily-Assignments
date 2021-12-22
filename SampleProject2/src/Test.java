import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bankEmp.xml");
		BankEmployee  bankEmployee = (BankEmployee)applicationContext.getBean("bankEmployee1");
		System.out.println(bankEmployee);

	}

}
