package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoCollectionImpl;
import dao.BookDaoFileCollectionImpl;
import model.BookPojo;

public class BookServiceImpl implements BookService {

	// service layer is the place where you write bussiness logic
	// this project is too small to have bussiness logic
	// this service layer is just to understand the interaction with DAO layer
	// so the service will not be doing anything much, it would just call methods of DAO layer
	
	BookDao bookDao = null; // BookServiceImpl is dependent on BookDaoCollectionImpl
	
	public BookServiceImpl() {
		//bookDao = new BookDaoCollectionImpl();
		bookDao = new BookDaoFileCollectionImpl();
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		return bookDao.updateBook(updateBook);
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.removeBook(bookId);
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo fetchById(int bookId) {
		return bookDao.fetchById(bookId);
	}

	@Override
	public List<BookPojo> fetchByGenre(String bookGenre) {
		return bookDao.fetchByGenre(bookGenre);
	}

	@Override
	public boolean writeToFile() {
		return bookDao.writeToFile(); // Dao impl not yet writtern
	}

}
