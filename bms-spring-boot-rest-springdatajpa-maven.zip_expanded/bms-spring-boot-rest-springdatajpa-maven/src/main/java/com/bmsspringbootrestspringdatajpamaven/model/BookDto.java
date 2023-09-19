package com.bmsspringbootrestspringdatajpamaven.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotNull;
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
public class BookDto {

	private int bookId;
	private String bookTitle;
	//private int bookAuthorId;
	private AuthorDto authorDto;
	
	private String bookGenre;
	private LocalDate bookPublished;

	private int bookCost;
	private String bookImageUrl;
	
	private List<CharacterDto> allCharacters;
}
