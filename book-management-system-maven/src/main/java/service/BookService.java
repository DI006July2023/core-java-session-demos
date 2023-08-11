package service;

import java.io.IOException;
import java.util.List;

import exception.BooksNotFoundException;
import model.BookPojo;

public interface BookService {

	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void removeBook(int bookId);
	List<BookPojo> fetchAllBooks() throws BooksNotFoundException;
	BookPojo fetchById(int bookId);
	List<BookPojo> fetchByGenre(String bookGenre);
	boolean writeToFile()throws IOException;
}
