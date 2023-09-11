package com.bms.bmsspringbootrestjdbctemplatemaven.model;

import java.time.LocalDate;

public class BookDto {
	private int bookId;
	private String bookTitle;
	private int bookAuthurId;
	private String bookGenre;
	private LocalDate bookPublished;
	private int bookCost;
	private String bookImageUrl;
	
	public BookDto(int bookId, String bookTitle, int bookAuthurId, String bookGenre, LocalDate bookPublished,
			int bookCost, String bookImageUrl) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthurId = bookAuthurId;
		this.bookGenre = bookGenre;
		this.bookPublished = bookPublished;
		this.bookCost = bookCost;
		this.bookImageUrl = bookImageUrl;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBookAuthurId() {
		return bookAuthurId;
	}

	public void setBookAuthurId(int bookAuthurId) {
		this.bookAuthurId = bookAuthurId;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public LocalDate getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(LocalDate bookPublished) {
		this.bookPublished = bookPublished;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	@Override
	public String toString() {
		return "BookDto [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthurId=" + bookAuthurId
				+ ", bookGenre=" + bookGenre + ", bookPublished=" + bookPublished + ", bookCost=" + bookCost
				+ ", bookImageUrl=" + bookImageUrl + "]";
	}
	
}
