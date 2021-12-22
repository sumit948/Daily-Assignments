import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ConstFile.xml");
		BankAdmin bankAdmin = (BankAdmin)applicationContext.getBean("admin1"); 
		BankEmployee  bankEmployee = (BankEmployee)applicationContext.getBean("bank1");
		System.out.println(bankAdmin);
		System.out.println(bankEmployee);
		bankAdmin.setAdminName("Mr.Weak");
		System.out.println(bankAdmin);

	}

}
