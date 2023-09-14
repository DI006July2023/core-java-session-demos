package com.bmsspringbootrestspringdatajpamaven.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmsspringbootrestspringdatajpamaven.dao.AuthorDao;
import com.bmsspringbootrestspringdatajpamaven.dao.entity.AuthorEntity;
import com.bmsspringbootrestspringdatajpamaven.model.AuthorDto;

@Service
public class AuthorServiceImpl implements AuthorService{

	private AuthorDao authorDao;
	
	@Autowired
	public AuthorServiceImpl(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Override
	public List<AuthorDto> fetchAllAuthors() {
		List<AuthorEntity> allAuthorEntity = authorDao.findAll();
		// we can't return a collection of AuthorEntity, we have to return a collection of AuthorDto
		// so we have to iterate through the collection of AuthorEntity and copy them into a collection of AuthorDto
		List<AuthorDto> allAuthorDto = new ArrayList<AuthorDto>();
		for(AuthorEntity eachAuthorEntity: allAuthorEntity) {
			// now copy eachAuthorEntity into an AuthorDto object
			AuthorDto eachAuthorDto = new AuthorDto();
			BeanUtils.copyProperties(eachAuthorEntity, eachAuthorDto);
			allAuthorDto.add(eachAuthorDto);
		}
		return allAuthorDto;
	}

	@Override
	public AuthorDto fetchAAuthor(int authorId) {
		// java.util.Optional was introduced in java 8
		// this was introduced to avoid NullPointerException
		// Optional is a wrapper around the data. We have to check if the data is present and then return the value
		Optional<AuthorEntity> authorEntityOptional = authorDao.findById(authorId);
		AuthorDto authorDto = null;
		// check if authorEnrtityOptional has the data, if it has copy the authorEntity object into AuthorDto
		if(authorEntityOptional.isPresent()){
			// copy authorEntity into authorDto
			authorDto = new AuthorDto();
			BeanUtils.copyProperties(authorEntityOptional.get(), authorDto);
		}
		return authorDto;
	}

	@Override
	public AuthorDto addAuthor(AuthorDto newAuthor) {
		// the incomming newAthur has to be copied into AuthurEntity object
		AuthorEntity newAuthorEntity = new AuthorEntity();
		BeanUtils.copyProperties(newAuthor, newAuthorEntity);
		
		AuthorEntity savedAuthorEntity = authorDao.saveAndFlush(newAuthorEntity);
		// the savedAuthorEntity has the auto generated author id in it
		// set the authorid in the newAuthor object
		newAuthor.setAuthorId(savedAuthorEntity.getAuthorId());
		return newAuthor;
	}

	@Override
	public AuthorDto updateAuthor(AuthorDto updateAuthor) {

		AuthorEntity updateAuthorEntity = new AuthorEntity();
		BeanUtils.copyProperties(updateAuthor, updateAuthorEntity);
		
		// saveAndFlush works 2 ways for insert and update
		// if updateAuthorEntity's primary key exists in the DB, ORM treats it as an update
		// if updateAuthorEntity's primary key does not exists in the DB, ORM treats it as an insert
		AuthorEntity savedAuthorEntity = authorDao.saveAndFlush(updateAuthorEntity);
		return updateAuthor;
	}

	@Override
	public void removeAuthor(int authorId) {
		authorDao.deleteById(authorId);
	}

	@Override
	public List<AuthorDto> fetchAuthorsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
