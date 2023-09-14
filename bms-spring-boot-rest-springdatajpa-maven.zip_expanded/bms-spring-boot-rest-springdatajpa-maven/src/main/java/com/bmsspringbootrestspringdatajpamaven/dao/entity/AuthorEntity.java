package com.bmsspringbootrestspringdatajpamaven.dao.entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode

@Entity // mandatory
@Table(name = "author_details") // this annotation is not required if the class name and the table name are the same
								// recommended is to still have it
public class AuthorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private int authorId;
	
	@Column(name = "author_first_name")
	private String authorFirstName;
	
	@Column(name = "author_last_name")
	private String authorLastName;

	public AuthorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorEntity(int authorId, String authorFirstName, String authorLastName) {
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
		return "AuthorEntity [authorId=" + authorId + ", authorFirstName=" + authorFirstName + ", authorLastName="
				+ authorLastName + "]";
	}
	
	
}
