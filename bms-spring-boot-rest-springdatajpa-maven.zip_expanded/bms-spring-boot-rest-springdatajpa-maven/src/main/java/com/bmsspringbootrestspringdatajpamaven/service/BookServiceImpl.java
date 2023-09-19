package com.bmsspringbootrestspringdatajpamaven.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmsspringbootrestspringdatajpamaven.dao.BookDao;
import com.bmsspringbootrestspringdatajpamaven.dao.entity.AuthorEntity;
import com.bmsspringbootrestspringdatajpamaven.dao.entity.BookEntity;
import com.bmsspringbootrestspringdatajpamaven.dao.entity.CharacterEntity;
import com.bmsspringbootrestspringdatajpamaven.model.AuthorDto;
import com.bmsspringbootrestspringdatajpamaven.model.BookDto;
import com.bmsspringbootrestspringdatajpamaven.model.CharacterDto;

@Service
public class BookServiceImpl implements BookService {

	BookDao bookDao;
	
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<BookDto> fetchAllBooks() {
		List<BookEntity> allBooksEntity = bookDao.findAll();
		// copy collection of book entity into a collection of book dto
		List<BookDto> allBooksDto = new ArrayList<BookDto>();
		allBooksEntity.forEach((eachBookEntity)->{
			BookDto eachBookDto = new BookDto();
			BeanUtils.copyProperties(eachBookEntity, eachBookDto); // this will not copy the composition object which is inside 
																			// eachBookEntity
			AuthorDto authorDto = new AuthorDto();
			// here we are copying the AuthorEntity composition object into a author dto object
			BeanUtils.copyProperties(eachBookEntity.getAuthorEntity(), authorDto);
			// next i have to set it in the BookDto object
			eachBookDto.setAuthorDto(authorDto);
			
			// here we have to traverse through the collection of Character entity and copy it into a collection of character dto
			List<CharacterDto> allCharactersDto = new ArrayList<CharacterDto>();
			for(CharacterEntity eachCharEntity: eachBookEntity.getAllCharacters()) {
				CharacterDto eachCharacterDto = new CharacterDto();
				BeanUtils.copyProperties(eachCharEntity, eachCharacterDto);
				allCharactersDto.add(eachCharacterDto);
			}
			eachBookDto.setAllCharacters(allCharactersDto);
			
			// now the eachBookDto is fully loaded with all the data and add it to the collection
			allBooksDto.add(eachBookDto);
			
		});
		return allBooksDto;
	}

	@Override
	public BookDto fetchABook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto addBook(BookDto newBook) {
		// copying entity into dto
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(newBook, bookEntity);
		AuthorEntity authorEntity = new AuthorEntity();
		// copying the composition also
		BeanUtils.copyProperties(newBook.getAuthorDto(), authorEntity);
		bookEntity.setAuthorEntity(authorEntity);
		
		bookDao.saveAndFlush(bookEntity);
		
		newBook.setBookId(bookEntity.getBookId());
		return newBook;
	}

	@Override
	public BookDto updateBook(BookDto updateBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.deleteById(bookId);
	}

	@Override
	public List<BookDto> fetchBooksByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}


}
