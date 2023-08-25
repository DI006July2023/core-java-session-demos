package springcoreannotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreAnnotationMain {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setAccNo(12345);
		acc1.setAccType("Savings");
		acc1.setAccBalance(400.0);
		
		System.out.println(acc1); // this calls acc1.toString()
		System.out.println("-----------------------------");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("springcoreannotationbased");
		context.refresh();
		
		Account account1 = context.getBean("acc", Account.class);
		System.out.println(account1);

		System.out.println("-----------------------------");
		
		StudentController studController = context.getBean("studentController", StudentController.class);
		System.out.println(studController);
	}

}
