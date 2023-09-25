package com.bmsspringbootrestspringdatajpamaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmsspringbootrestspringdatajpamaven.model.BookDto;
import com.bmsspringbootrestspringdatajpamaven.service.BookService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class BookController {

	BookService bookService;
	
	@Autowired	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	// 1. fetch all books
	// http://localhost:7474/api/books
	@GetMapping("/books")
	public ResponseEntity<List<BookDto>> fetchAllBooks(){
		// here ResponseEntity wraps up the response body(1st argument) and the status code(2nd argument)
		ResponseEntity<List<BookDto>> responseEntity = new ResponseEntity<List<BookDto>>(bookService.fetchAllBooks(), HttpStatus.OK);
		//return bookService.fetchAllBooks();
		return responseEntity;
	}
	
	// 2. fetch a book
	// http://localhost:7474/api/books/102
	// this 102 is called a PathVariable with the name bid and should be extracted and store in a java variable/parameter(bookId)
	@GetMapping("/books/{bid}")
	public ResponseEntity<BookDto> fetchABook(@PathVariable("bid") int bookId) {
		return new ResponseEntity<BookDto>(bookService.fetchABook(bookId), HttpStatus.OK);
	}
	
	// 3. add a book
	// http://localhost:7474/api/books
	// here the new book data to be inserted into the DB is sent along with the request body
	// so what we should do is extract the new book data from the request body and store in the java method parmameter(newBook)
	// this is done with the help of @RequestBody
	@PostMapping("/books")
	public ResponseEntity<BookDto> addBook(@RequestBody BookDto newBook) {
		return new ResponseEntity<BookDto>(bookService.addBook(newBook), HttpStatus.OK);
	}
	
	
	// 4. update a book
	// http://localhost:7474/api/books
	@PutMapping("/books")
	public ResponseEntity<BookDto> updateBook(@RequestBody BookDto updateBook) {
		return new ResponseEntity<BookDto>(bookService.updateBook(updateBook), HttpStatus.OK);
	}
	
	
	// 5. delete a book
	// http://localhost:7474/api/books/102
	@DeleteMapping("/books/{bid}")
	public ResponseEntity<Void> removeBook(@PathVariable("bid") int bookId) {
		bookService.removeBook(bookId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// http://localhost:7474/api/books/genre/Commedy
	@GetMapping("/books/genre/{gen}")
	public ResponseEntity<List<BookDto>> fetchBooksByGenre(@PathVariable("gen") String bookGenre){
		return new ResponseEntity<List<BookDto>>(bookService.fetchBooksByGenre(bookGenre), HttpStatus.OK);
	}
	
//	@ExceptionHandler({ApplicationException.class})
//	public void handleApplicationException() {
//		System.out.println("Book does not exist!");
//	}
	
}
