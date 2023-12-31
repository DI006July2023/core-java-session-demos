package com.bmsspringbootrestspringdatajpamaven.model;

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

public class AuthorDto {

	private int authorId;
	
	@NotNull
	private String authorFirstName;
	
	@NotNull
	private String authorLastName;
	
	List<BookDto> allBooksDto;
}
