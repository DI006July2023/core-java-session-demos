import java.util.Scanner;

public class BookManagementSystemMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char con = 'n';
		do {
			System.out.println("************************");
			System.out.println("1. Add a new book");
			System.out.println("2. Remove a book");
			System.out.println("3. Update a book");
			System.out.println("4. Fetch all books");
			System.out.println("5. Fetch a book by ID");
			System.out.println("6. Fetch books by Genre");
			System.out.println("7. Write to a file");
			System.out.println("8. Exit");
			System.out.println("************************");
			System.out.println("Enter your option:");
			int option = scan.nextInt();
			System.out.println("************************");
			switch(option) {
				case 1:
					System.out.println("Book added...");
					break;
				case 2:
					System.out.println("Book remove...");
					break;
				case 3:
					System.out.println("Book updated...");
					break;
				case 4:
					System.out.println("Book fetched...");
					break;
				case 5:
					System.out.println("Book fetched...");
					break;
				case 6:
					System.out.println("Book fetched...");
					break;
				case 7:
					System.out.println("Writtern to a file...");
					break;
				case 8:
					System.out.println("************************");
					System.out.println("Thankyou for using the book management system!");
					System.out.println("************************");
					System.exit(0);
			}
			System.out.println("Do you want ot continue?(y/n)");
			con = scan.next().charAt(0); 
		}while(con == 'y');
		
		
	
		
	}

}
