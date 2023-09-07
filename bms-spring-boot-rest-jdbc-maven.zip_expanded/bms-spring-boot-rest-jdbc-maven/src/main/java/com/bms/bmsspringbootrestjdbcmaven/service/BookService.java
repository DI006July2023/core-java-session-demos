package com.bms.bmsspringbootrestjdbcmaven.service;

import java.util.List;

import com.bms.bmsspringbootrestjdbcmaven.model.BookDto;

public interface BookService {
	public List<BookDto> fetchAllBooks();
	public BookDto fetchABook(int bookId);
	public BookDto addBook(BookDto newBook);
	public BookDto updateBook(BookDto updateBook);
	public void removeBook(int bookId);
	
	public List<BookDto> fetchBooksByGenre(String genre);
}
