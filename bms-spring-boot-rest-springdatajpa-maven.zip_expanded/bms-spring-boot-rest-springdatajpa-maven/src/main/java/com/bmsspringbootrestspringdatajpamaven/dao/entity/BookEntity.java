package com.bmsspringbootrestspringdatajpamaven.dao.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="book_details")
public class BookEntity {
	
	@Id
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@JoinColumn(name = "book_author_id")
	@ManyToOne
	AuthorEntity authorEntity;
	
//	@Column(name="book_author_id")
//	private int bookAuthorId;
	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_published")
	private LocalDate bookPublished;
	
	@Column(name="book_cost")
	private int bookCost;
	
	@Column(name="book_image_url")
	private String bookImageUrl;
	
}
