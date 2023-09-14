package com.bmsspringbootrestspringdatajpamaven.service;

import java.util.List;

import com.bmsspringbootrestspringdatajpamaven.model.AuthorDto;

public interface AuthorService {
	public List<AuthorDto> fetchAllAuthors();
	public AuthorDto fetchAAuthor(int authorId);
	public AuthorDto addAuthor(AuthorDto newAuthor);
	public AuthorDto updateAuthor(AuthorDto updateAuhtor);
	public void removeAuthor(int authorId);
	
	public List<AuthorDto> fetchAuthorsByFirstName(String firstName);
}
