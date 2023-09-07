package com.bms.bmsspringbootrestjdbcmaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bmsspringbootrestjdbcmaven.dao.BookDao;
import com.bms.bmsspringbootrestjdbcmaven.model.BookDto;

@Service
public class BookServiceImpl implements BookService {

	BookDao bookDao;
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public List<BookDto> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookDto fetchABook(int bookId) {
		return bookDao.fetchABook(bookId);
	}

	@Override
	public BookDto addBook(BookDto newBook) {
		return bookDao.addBook(newBook);
	}

	@Override
	public BookDto updateBook(BookDto updateBook) {
		return bookDao.updateBook(updateBook);
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.removeBook(bookId);
	}

	@Override
	public List<BookDto> fetchBooksByGenre(String genre) {
		return bookDao.fetchBooksByGenre(genre);
	}

}
