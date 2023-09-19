package com.bmsspringbootrestspringdatajpamaven.service;

import java.util.List;

import com.bmsspringbootrestspringdatajpamaven.model.AuthorDto;
import com.bmsspringbootrestspringdatajpamaven.model.CharacterDto;

public interface CharacterService {
	public List<CharacterDto> fetchAllCharacter();
	public CharacterDto fetchACharacter(int characterId);
	public CharacterDto addCharacter(CharacterDto newCharacter);
	public CharacterDto updateCharacter(CharacterDto updateCharacter);
	public void removeCharacter(int characterId);
}
