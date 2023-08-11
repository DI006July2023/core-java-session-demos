package dao;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.BookPojo;

public class BookDaoFileCollectionImplTest {

	@Test
	public void testFetchAllBooks() throws FileNotFoundException, IOException {

		//Arrange
		BookDaoFileCollectionImpl bookDao = new BookDaoFileCollectionImpl("TestFileDB.txt"); // the constructor reads the contents of the file
		// Calculator calc = new Calculator();
		
		// Act
		// actualOuput
		List<BookPojo> actualAllBooks =  bookDao.fetchAllBooks();
		// int actualOuput = calc.add(4, 5);	
		
		// expectedOutput
		List<BookPojo> expectedAllBooks = new ArrayList<BookPojo>();
		expectedAllBooks.add(new BookPojo(101, "Harry Potter and the Deathly Hallows", "J.K.Rowling", "Fiction", LocalDate.of(2010, 4, 4), 125,""));
		// int expectedOutput = 9;
		
		// Assert
		Assertions.assertEquals(actualAllBooks.size(), expectedAllBooks.size());
		//Assertions.assertEquals(expectedOutput, actualOutput);
		
	}
}
