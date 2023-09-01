package com.bms.bmsspringbootrestjdbcmaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bmsspringbootrestjdbcmaven.dao.AuthorDao;
import com.bms.bmsspringbootrestjdbcmaven.model.AuthorDto;

//@Component
@Service
public class AuthorServiceImpl implements AuthorService{
	
//	@Autowired // if autowired used here , it is feild DI
	AuthorDao authorDao;
	
	@Autowired// if autowired used here , it is constructor DI
	public AuthorServiceImpl(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Override
	public List<AuthorDto> fetchAllAuthors() {
		return authorDao.fetchAllAuthors();
	}

	@Override
	public AuthorDto fetchAAuthor(int authorId) {
		return authorDao.fetchAAuthor(authorId);
	}

	@Override
	public AuthorDto addAuthor(AuthorDto newAuthor) {
		return authorDao.addAuthor(newAuthor);
	}

	@Override
	public AuthorDto updateAuthor(AuthorDto updateAuhtor) {
		return authorDao.updateAuthor(updateAuhtor);
	}

	@Override
	public void removeAuthor(int authorId) {
		authorDao.removeAuthor(authorId);
	}

	@Override
	public List<AuthorDto> fetchAuthorsByFirstName(String firstName) {
		return authorDao.fetchAuthorsByFirstName(firstName);
	}

}
