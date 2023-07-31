package model;

import java.time.LocalDate;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookGenre;
	private LocalDate bookPublished;
	private int bookCost;
	private String bookImageUrl;
	
	// a transfer object at the max contains the following
	// constructors
	// public getters/setters
	// toString()
	// equals()
	// hashcode()

	// Lombok framework - helps to generate constructors, getters and setters
	
	public BookPojo(int bookId, String bookTitle, String bookAuthor, String bookGenre, LocalDate bookPublished,
			int bookCost, String bookImageUrl) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
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

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
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
	
	public BookPojo copyBookData() {
		// incoming bookPojo object will be copied to the returning bookPojo object
		BookPojo returningBookPojo = new BookPojo(this.bookId, this.bookTitle, this.bookAuthor, this.bookGenre, 
													this.bookPublished, this.bookCost, this.bookImageUrl);
		return returningBookPojo;
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookGenre="
				+ bookGenre + ", bookPublished=" + bookPublished + ", bookCost=" + bookCost + ", bookImageUrl="
				+ bookImageUrl + "]";
	}
	
	
}
