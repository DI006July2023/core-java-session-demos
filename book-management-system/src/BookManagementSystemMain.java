import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.BookPojo;
import service.BookService;
import service.BookServiceImpl;
import view.BookManagementSystemView;

public class BookManagementSystemMain{
	
	public static void main(String[] args) {
		
		BookManagementSystemView view = new BookManagementSystemView();
		view.runMenu();
		
	}

}
