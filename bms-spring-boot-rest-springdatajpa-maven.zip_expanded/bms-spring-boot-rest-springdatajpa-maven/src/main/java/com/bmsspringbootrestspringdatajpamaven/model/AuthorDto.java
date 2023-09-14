package com.bmsspringbootrestspringdatajpamaven.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode

public class AuthorDto {
	private int authorId;
	private String authorFirstName;
	private String authorLastName;
	
	public AuthorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorDto(int authorId, String authorFirstName, String authorLastName) {
		super();
		this.authorId = authorId;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	@Override
	public String toString() {
		return "AuthorDto [authorId=" + authorId + ", authorFirstName=" + authorFirstName + ", authorLastName="
				+ authorLastName + "]";
	}
	
	
	
}
