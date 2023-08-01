import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.BookPojo;
import service.BookService;
import service.BookServiceImpl;

public class BookManagementSystemMain {
	
	public static void main(String[] args) {
		
		//BookServiceImpl bookServiceImpl = new BookServiceImpl(); // not recomended as the class is not abstracted
		BookService bookService = new BookServiceImpl();
		
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
					System.out.println("Please enter the details of the book: ");
					System.out.println("Enter Book Title : ");
					scan.nextLine();
					String bookTitle = scan.nextLine();
					
					System.out.println("Enter Book Author : ");
					String bookAuthor = scan.nextLine();
					
					System.out.println("Enter Book Genre : ");
					String bookGenre = scan.nextLine();
					
					System.out.println("Enter Book Published Date (yyyy-mm-dd) : ");
					String bookPublished = scan.nextLine();
					LocalDate bookPublishedDate = LocalDate.parse(bookPublished);
					
					System.out.println("Enter Book Cost : ");
					int bookCost = scan.nextInt();
					
					BookPojo newBookPojo = new BookPojo(0, bookTitle, bookAuthor, bookGenre, bookPublishedDate, bookCost, "");
					
					BookPojo returnedBookPojo = bookService.addBook(newBookPojo);
					
					System.out.println("Book added succesfully!!");
					System.out.println("New Book ID is: " + returnedBookPojo.getBookId());
					
					break;
				case 2:
					System.out.println("Enter the book ID to be removed:");
					int removeBookId = scan.nextInt();
					BookPojo removeFetchedBook = bookService.fetchById(removeBookId);
					if(removeFetchedBook == null) {
						System.out.println("Sorry! Book with this ID does not exist!!");
						break;
					}else {
						// print the book info
						System.out.println(removeFetchedBook);
						System.out.println("Are you sure you want ot remove this book?(y/n):");
						char ans = scan.next().charAt(0);
						if(ans == 'y') {
							bookService.removeBook(removeBookId);
							System.out.println("The book has been removed!!");
						}
					}
					break;
				case 3:
					System.out.println("Enter the book ID to be updated:");
					int updateBookId = scan.nextInt();
					BookPojo updateFetchedBook = bookService.fetchById(updateBookId);
					if(updateFetchedBook == null) {
						System.out.println("Sorry! Book with this ID does not exist!!");
						break;
					}else {
						// print the book info
						System.out.println(updateFetchedBook);
						System.out.println("Please enter the new cost:");
						int updateBookCost = scan.nextInt();
						
						updateFetchedBook.setBookCost(updateBookCost);// this replaces the old book cost with 
																				//new book cost in the pojo
						
						bookService.updateBook(updateFetchedBook);
						System.out.println("Book information updated successfully!!");
					}
					break;
				case 4:
					List<BookPojo> allBooks = bookService.fetchAllBooks();
					for(BookPojo eachBook: allBooks) {
						//System.out.println(eachBook.toString());
						System.out.println(eachBook);
					}
					break;
				case 5:
					System.out.println("Enter the book ID to fetch the book:");
					int bookId = scan.nextInt();
					BookPojo fetchedBook = bookService.fetchById(bookId);
					if(fetchedBook == null) {
						System.out.println("Sorry! Book with this ID does not exist!!");
						break;
					}else {
						// print the book info
						System.out.println(fetchedBook);
					}
					
					break;
				case 6:
					System.out.println("Enter the book genre to fetch the books:");
					scan.nextLine();
					String inputBookGenre = scan.nextLine();
					List<BookPojo> allBookGenre = bookService.fetchByGenre(inputBookGenre);
					if(allBookGenre.isEmpty()) {
						System.out.println("Sorry! Books with this genre does not exist!!");
						break;
					}else {
						// print the all the book info
						for(BookPojo eachBook: allBookGenre) {
							//System.out.println(eachBook.toString());
							System.out.println(eachBook);
						}
					}
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
