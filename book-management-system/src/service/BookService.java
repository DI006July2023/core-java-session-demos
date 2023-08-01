package service;

import java.util.List;

import model.BookPojo;

public interface BookService {

	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void removeBook(int bookId);
	List<BookPojo> fetchAllBooks();
	BookPojo fetchById(int bookId);
	List<BookPojo> fetchByGenre(String bookGenre);
	boolean writeToFile();
}
