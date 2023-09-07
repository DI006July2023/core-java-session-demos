package com.bms.bmsspringbootrestjdbcmaven.dao;

import java.util.List;

import com.bms.bmsspringbootrestjdbcmaven.model.AuthorDto;
import com.bms.bmsspringbootrestjdbcmaven.model.BookDto;

public interface BookDao {
	public List<BookDto> fetchAllBooks();
	public BookDto fetchABook(int bookId);
	public BookDto addBook(BookDto newBook);
	public BookDto updateBook(BookDto updateBook);
	public void removeBook(int bookId);
	
	public List<BookDto> fetchBooksByGenre(String genre);

}
