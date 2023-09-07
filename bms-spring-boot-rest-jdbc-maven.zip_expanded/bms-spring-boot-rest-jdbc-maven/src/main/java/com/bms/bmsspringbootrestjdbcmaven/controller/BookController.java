package com.bms.bmsspringbootrestjdbcmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bmsspringbootrestjdbcmaven.model.BookDto;
import com.bms.bmsspringbootrestjdbcmaven.service.BookService;

@CrossOrigin
@RestController
public class BookController {

	BookService bookService;
	
	@Autowired	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	// 1. fetch all books
	// http://localhost:4545/books
	@GetMapping("/books")
	public List<BookDto> fetchAllBooks(){
		return bookService.fetchAllBooks();
	}
	
	// 2. fetch a book
	// http://localhost:4545/books/102
	// this 102 is called a PathVariable with the name bid and should be extracted and store in a java variable/parameter(bookId)
	@GetMapping("/books/{bid}")
	public BookDto fetchABook(@PathVariable("bid") int bookId) {
		return bookService.fetchABook(bookId);
	}
	
	// 3. add a book
	// http://localhost:4545/books
	// here the new book data to be inserted into the DB is sent along with the request body
	// so what we should do is extract the new book data from the request body and store in the java method parmameter(newBook)
	// this is done with the help of @RequestBody
	@PostMapping("/books")
	public BookDto addBook(@RequestBody BookDto newBook) {
		return bookService.addBook(newBook);
	}
	
	
	// 4. update a book
	// http://localhost:4545/books
	@PutMapping("/books")
	public BookDto updateBook(@RequestBody BookDto updateBook) {
		return bookService.updateBook(updateBook);
	}
	
	
	// 5. delete a book
	// http://localhost:4545/books/102
	@DeleteMapping("/books/{bid}")
	public void removeBook(@PathVariable("bid") int bookId) {
		bookService.removeBook(bookId);
	}
	
	@GetMapping("/books/genre/{gen}")
	public List<BookDto> fetchBooksByGenre(@PathVariable("gen") String bookGenre){
		return bookService.fetchBooksByGenre(bookGenre);
	}
	
}
