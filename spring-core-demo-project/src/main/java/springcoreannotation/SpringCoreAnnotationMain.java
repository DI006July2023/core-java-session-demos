package springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreAnnotationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("springcoreannotation");
		context.refresh();
		
		Account acc1 = context.getBean("acc", Account.class);
		System.out.println(acc1);
		
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);
		
	}

}
