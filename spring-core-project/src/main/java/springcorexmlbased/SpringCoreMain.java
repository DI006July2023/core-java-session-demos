package springcorexmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreMain {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setAccNo(12345);
		acc1.setAccType("Savings");
		acc1.setAccBalance(400.0);
		
		System.out.println(acc1); // this calls acc1.toString()

		System.out.println("===================================");
		// create the spring core container
		ApplicationContext context = new ClassPathXmlApplicationContext("anyname.xml");
		
		// ask the container for the bean with id myAccount
		
		//Account account2 = (Account)context.getBean("myAccount");
		Account account1 = context.getBean("myAccount", Account.class);
		account1.setAccNo(11111);
		account1.setAccType("Checking");
		account1.setAccBalance(200.0);
		
		System.out.println(account1);
		System.out.println("===================================");
		
		Room room1 = new Room(22, 150, 80);
		System.out.println(room1);
		
		System.out.println("===================================");
		Room room2 = context.getBean("room", Room.class);
		System.out.println(room2);
		
		System.out.println("===================================");
		Table table1 = context.getBean("table", Table.class);
		
		System.out.println(table1);
		
		System.out.println("===================================");
		Projector projector = new Projector("DELL502", "White");
		Television myTv = new Television("Samsung101");
		ClassRoom scienceRoom = new ClassRoom(projector, 20001);
		scienceRoom.setTv(myTv);
		System.out.println(scienceRoom);
		
		System.out.println("===================================");
		
		ClassRoom mathRoom = context.getBean("mathRoom", ClassRoom.class);
		System.out.println(mathRoom);
		
	}

}
