package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.BookPojo;

public class BookDaoCollectionImpl implements BookDao{

	// here I will use a collection as my data store
	// this collection is volatile
	List<BookPojo> bookDataStore = new ArrayList<BookPojo>(); // this is our temporary DB, until we learn DB
	
	public BookDaoCollectionImpl() {
		BookPojo pojo1 = new BookPojo(101, "HarryPotter and the Order of Phoenix", "J.K.Rowling", "Fantasy", LocalDate.of(1995, 10, 5), 100, "");
		BookPojo pojo2 = new BookPojo(102, "HarryPotter and the prizoner of Azkaban", "J.K.Rowling", "Fantasy", LocalDate.of(1997, 6, 14), 120, "");
		BookPojo pojo3 = new BookPojo(103, "HarryPotter and the Deathly Hallows", "J.K.Rowling", "Fantasy", LocalDate.of(1999, 3, 9), 90, "");
		bookDataStore.add(pojo1);
		bookDataStore.add(pojo2);
		bookDataStore.add(pojo3);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		int newBookId = bookDataStore.get(bookDataStore.size()-1).getBookId() + 1; // my own logic to compute the new book id
		newBook.setBookId(newBookId);
		bookDataStore.add(newBook.copyBookData());
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookId() == updateBook.getBookId()) {
				bookDataStore.set(i, updateBook.copyBookData());
			}
		}
		return updateBook;
	}

	@Override
	public void removeBook(int bookId) {
		//i am able to use this for loop because List is indexed
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookId() == bookId) {
				bookDataStore.remove(i);
			}
		}
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		List<BookPojo> returnBookDataStore = new ArrayList<BookPojo>(bookDataStore);
		return returnBookDataStore;
	}

	@Override
	public BookPojo fetchById(int bookId) {
		BookPojo returnBookPojo = null;
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookId() == bookId) {
				returnBookPojo = bookDataStore.get(i).copyBookData();
			}
		}
		return returnBookPojo;
	}

	@Override
	public List<BookPojo> fetchByGenre(String bookGenre) {
		List<BookPojo> returnBookPojoByGenre = new ArrayList<BookPojo>();
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookGenre().equals(bookGenre)) {
				returnBookPojoByGenre.add(bookDataStore.get(i).copyBookData());
			}
		}
		return returnBookPojoByGenre;
	}

	@Override
	public boolean writeToFile() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
