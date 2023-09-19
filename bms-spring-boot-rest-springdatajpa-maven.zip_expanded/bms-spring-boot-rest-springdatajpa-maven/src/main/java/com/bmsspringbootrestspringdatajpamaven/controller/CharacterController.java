package com.bmsspringbootrestspringdatajpamaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmsspringbootrestspringdatajpamaven.model.CharacterDto;
import com.bmsspringbootrestspringdatajpamaven.service.CharacterService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class CharacterController {

	private CharacterService characterService;
	
	@Autowired	
	public CharacterController(CharacterService characterService) {
		super();
		this.characterService = characterService;
	}

	@GetMapping("/characters")
	public ResponseEntity<List<CharacterDto>> fetchAllCharacters(){
		return new ResponseEntity(characterService.fetchAllCharacter(), HttpStatus.OK);
	}
}
