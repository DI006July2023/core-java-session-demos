package com.bmsspringbootrestspringdatajpamaven.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmsspringbootrestspringdatajpamaven.dao.CharacterDao;
import com.bmsspringbootrestspringdatajpamaven.dao.entity.BookEntity;
import com.bmsspringbootrestspringdatajpamaven.dao.entity.CharacterEntity;
import com.bmsspringbootrestspringdatajpamaven.model.BookDto;
import com.bmsspringbootrestspringdatajpamaven.model.CharacterDto;

@Service
public class CharacterServiceImpl implements CharacterService{

	private CharacterDao characterDao;
	
	@Autowired	
	public CharacterServiceImpl(CharacterDao characterDao) {
		super();
		this.characterDao = characterDao;
	}

	@Override
	public List<CharacterDto> fetchAllCharacter() {
		List<CharacterEntity> allCharactersEntity = characterDao.findAll();
		List<CharacterDto> allCharactersDto = new ArrayList<CharacterDto>();
		allCharactersEntity.forEach((eachCharacterEntity)->{
			CharacterDto eachCharacterDto = new CharacterDto();
			BeanUtils.copyProperties(eachCharacterEntity, eachCharacterDto);
			
			List<BookDto> allBooksDto = new ArrayList<BookDto>();
			for(BookEntity eachBookEntity: eachCharacterEntity.getAllBooks()) {
				BookDto eachBookDto = new BookDto();
				BeanUtils.copyProperties(eachBookEntity, eachBookDto); 
				allBooksDto.add(eachBookDto);
			}
			
			eachCharacterDto.setAllBooks(allBooksDto);
			allCharactersDto.add(eachCharacterDto);
		});	
		return allCharactersDto;
	}

	@Override
	public CharacterDto fetchACharacter(int characterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharacterDto addCharacter(CharacterDto newCharacter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharacterDto updateCharacter(CharacterDto updateCharacter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCharacter(int characterId) {
		// TODO Auto-generated method stub
		
	}

}
