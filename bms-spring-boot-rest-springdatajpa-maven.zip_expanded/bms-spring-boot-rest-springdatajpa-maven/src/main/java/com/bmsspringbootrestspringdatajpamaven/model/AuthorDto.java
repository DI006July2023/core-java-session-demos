package com.bmsspringbootrestspringdatajpamaven.model;

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
	private String authorFirstName;
	private String authorLastName;
	
}
