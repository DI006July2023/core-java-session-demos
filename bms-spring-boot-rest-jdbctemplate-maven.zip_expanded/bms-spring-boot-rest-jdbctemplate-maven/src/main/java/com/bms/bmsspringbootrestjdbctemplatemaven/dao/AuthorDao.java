package com.bms.bmsspringbootrestjdbctemplatemaven.dao;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bms.bmsspringbootrestjdbctemplatemaven.model.AuthorDto;

public interface AuthorDao {
	public List<AuthorDto> fetchAllAuthors();
	public AuthorDto fetchAAuthor(int authorId);
	public AuthorDto addAuthor(AuthorDto newAuthor);
	public AuthorDto updateAuthor(AuthorDto updateAuhtor);
	public void removeAuthor(int authorId);
	
	public List<AuthorDto> fetchAuthorsByFirstName(String firstName);
}
