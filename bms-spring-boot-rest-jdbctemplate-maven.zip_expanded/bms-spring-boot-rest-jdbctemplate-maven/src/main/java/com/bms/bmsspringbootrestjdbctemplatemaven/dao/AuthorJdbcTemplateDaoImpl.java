package com.bms.bmsspringbootrestjdbctemplatemaven.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bms.bmsspringbootrestjdbctemplatemaven.model.AuthorDto;

@Repository
public class AuthorJdbcTemplateDaoImpl implements AuthorDao {

	@Override
	public List<AuthorDto> fetchAllAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorDto fetchAAuthor(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorDto addAuthor(AuthorDto newAuthor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorDto updateAuthor(AuthorDto updateAuhtor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAuthor(int authorId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<AuthorDto> fetchAuthorsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
