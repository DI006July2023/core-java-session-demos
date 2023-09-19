package com.bmsspringbootrestspringdatajpamaven.model;

import java.util.List;

import com.bmsspringbootrestspringdatajpamaven.dao.entity.CharacterEntity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class CharacterDto {
	private int characterId;
	private String characterFirstName;
	private String characterLastName;
	private List<BookDto> allBooks;
}
