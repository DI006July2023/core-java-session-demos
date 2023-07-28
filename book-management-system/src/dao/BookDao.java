package dao;

import java.util.List;

import model.BookPojo;

public interface BookDao {

	// 7 methods
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void removeBook(int bookId);
	List<BookPojo> fetchAllBooks();
	BookPojo fetchById(int bookId);
	List<BookPojo> fetchByGenre(String bookGenre);
	boolean writeToFile(List<BookPojo> allBooks);
	
}
