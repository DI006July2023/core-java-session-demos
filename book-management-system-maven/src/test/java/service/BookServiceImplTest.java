package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.BookDao;
import dao.BookDaoFileCollectionStubImpl;
import exception.BooksNotFoundException;
import model.BookPojo;

public class BookServiceImplTest {

	@Test
	public void testfetchAllBooks() {
		// Arrange
		BookDao bookDaoStub = new BookDaoFileCollectionStubImpl();
		BookService bookService = new BookServiceImpl(bookDaoStub);
		
		//Act - you make the actual call
		try {
			List<BookPojo> actualData = bookService.fetchAllBooks();
			List<BookPojo> expectedData = new ArrayList<BookPojo>();
			expectedData.add(new BookPojo(201, "Harry Potter and the order of Phoenix", "J.K.Rowling", "Fantasy", LocalDate.of(2010, 10, 10), 140, ""));
			
			//Assert
			Assertions.assertEquals(actualData.size(), expectedData.size());
		} catch (BooksNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
