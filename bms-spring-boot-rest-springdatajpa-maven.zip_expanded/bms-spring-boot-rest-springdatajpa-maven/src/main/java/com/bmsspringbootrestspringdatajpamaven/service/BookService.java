package com.bmsspringbootrestspringdatajpamaven.service;

import java.util.List;

import com.bmsspringbootrestspringdatajpamaven.model.BookDto;

public interface BookService {
	public List<BookDto> fetchAllBooks();
	public BookDto fetchABook(int bookId);
	public BookDto addBook(BookDto newBook);
	public BookDto updateBook(BookDto updateBook);
	public void removeBook(int bookId);
	
	public List<BookDto> fetchBooksByGenre(String genre);
}
