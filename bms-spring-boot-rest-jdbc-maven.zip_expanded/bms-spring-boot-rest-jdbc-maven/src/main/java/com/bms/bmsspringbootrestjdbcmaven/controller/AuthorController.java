package com.bms.bmsspringbootrestjdbcmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bmsspringbootrestjdbcmaven.model.AuthorDto;
import com.bms.bmsspringbootrestjdbcmaven.model.BookDto;
import com.bms.bmsspringbootrestjdbcmaven.service.AuthorService;

@RestController
public class AuthorController {
		//@Autowired
		AuthorService authorService;
	
		@Autowired		
		public AuthorController(AuthorService authorService) {
			super();
			this.authorService = authorService;
		}

		// 1. fetch all authors
		// http://localhost:4545/authors
		@GetMapping("/authors")
		public List<AuthorDto> fetchAllAuthors(){
			return authorService.fetchAllAuthors();
		}
		
		// 2. fetch a author
		// http://localhost:4545/authors/302
		@GetMapping("/authors/{aid}")
		public AuthorDto fetchAAuthor(@PathVariable("aid") int authorId) {
			
			return null;
		}
		
		// 3. add an author
		// http://localhost:4545/authors
		@PostMapping("/authors")
		public AuthorDto addAuthor(@RequestBody AuthorDto newAuthor) {
			
			return null;
		}
		
		
		// 4. update a author
		// http://localhost:4545/authors
		@PutMapping("/authors")
		public AuthorDto updateAuthor(@RequestBody AuthorDto updateAuhtor) {
			
			return null;
		}
		
		
		// 5. delete an author
		// http://localhost:4545/authors/302
		@DeleteMapping("/authors/{aid}")
		public void removeAuthor(@PathVariable("aid") int authorId) {
			authorService.removeAuthor(authorId);
		}
		
}
