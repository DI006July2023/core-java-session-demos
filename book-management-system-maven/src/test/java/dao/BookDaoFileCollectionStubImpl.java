package dao;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.BookPojo;

public class BookDaoFileCollectionStubImpl implements BookDao{

	// stubs dont read from external resources(files/DB)
	BookPojo onlyBookPojo = new BookPojo(201, "Harry Potter and the order of Phoenix", "J.K.Rowling", "Fantasy", LocalDate.of(2010, 10, 10), 140, "");                             
	
	@Override
	public BookPojo addBook(BookPojo newBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		List<BookPojo> returnAllBooks = new ArrayList<BookPojo>();
		returnAllBooks.add(onlyBookPojo);
		return returnAllBooks;
	}

	@Override
	public BookPojo fetchById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookPojo> fetchByGenre(String bookGenre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean writeToFile() throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

}
