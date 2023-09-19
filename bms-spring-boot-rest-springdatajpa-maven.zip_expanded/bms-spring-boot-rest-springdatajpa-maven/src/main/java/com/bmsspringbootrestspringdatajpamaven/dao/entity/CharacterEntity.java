package com.bmsspringbootrestspringdatajpamaven.dao.entity;

import java.util.List;

import com.bmsspringbootrestspringdatajpamaven.model.BookDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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

@Entity 
@Table(name = "character_details")
public class CharacterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="character_id")
	private int characterId;
	
	@Column(name="character_first_name")
	private String characterFirstName;
	
	@Column(name="character_last_name")
	private String characterLastName;
	
	@ManyToMany(mappedBy = "allCharacters")
	private List<BookEntity> allBooks;
}
