package com.bmsspringbootrestspringdatajpamaven.dao.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
@Table(name="book_details")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@ManyToOne
	@JoinColumn(name = "book_author_id")
	private AuthorEntity authorEntity;

//	@Column(name="book_author_id")
//	private int bookAuthorId;
	
	
	@ManyToMany 
	// since @JoinTable is used here, i would call book_details as the owner and character_details is the inverse side
	@JoinTable(name="book_character_details",
	           joinColumns = @JoinColumn(name="b_id"),
	           inverseJoinColumns = @JoinColumn(name="c_id"))
	private List<CharacterEntity> allCharacters;
	

	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_published")
	private LocalDate bookPublished;
	
	@Column(name="book_cost")
	private int bookCost;
	
	@Column(name="book_image_url")
	private String bookImageUrl;
	
}
