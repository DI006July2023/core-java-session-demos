package com.bmsspringbootrestspringdatajpamaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmsspringbootrestspringdatajpamaven.model.BookDto;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<BookDto> fetchAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto fetchABook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto addBook(BookDto newBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto updateBook(BookDto updateBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookDto> fetchBooksByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}


}
