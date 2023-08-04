package springcorexml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreXMLMain {

	public static void main(String[] args) {
		Account acc1 = new Account(10001, "ABC");
		System.out.println(acc1);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Account acc2 = context.getBean("account", Account.class);
		System.out.println(acc2);
		
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);
	}

}
