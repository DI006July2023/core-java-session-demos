package com.bmsspringbootrestspringdatajpamaven.dao.entity;

import java.util.List;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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

	// this is not a column in the table
	// this is just to get bidirectional mapping through Spring Data Jpa
	@OneToMany(mappedBy = "authorEntity", cascade = CascadeType.ALL)
	List<BookEntity> allBooksEntity;
	
}
