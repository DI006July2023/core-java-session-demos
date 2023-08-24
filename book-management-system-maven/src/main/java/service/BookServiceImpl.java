package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import dao.BookDao;
import dao.BookDaoCollectionImpl;
import dao.BookDaoDatabaseImpl;
import dao.BookDaoFileCollectionImpl;
import exception.BooksNotFoundException;
import model.BookPojo;

public class BookServiceImpl implements BookService {

	// service layer is the place where you write bussiness logic
	// this project is too small to have bussiness logic
	// this service layer is just to understand the interaction with DAO layer
	// so the service will not be doing anything much, it would just call methods of DAO layer
	
	BookDao bookDao = null; // BookServiceImpl is dependent on BookDaoCollectionImpl
	
	public BookServiceImpl()throws FileNotFoundException, IOException{
		//bookDao = new BookDaoCollectionImpl();
		//bookDao = new BookDaoFileCollectionImpl();
		bookDao = new BookDaoDatabaseImpl();
	}
	
	// added this constructor for unit testing the service layer
	public BookServiceImpl(BookDao bookDao) {
		//super();
		this.bookDao = bookDao;
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
	public List<BookPojo> fetchAllBooks() throws BooksNotFoundException{
		List<BookPojo> allBooks = bookDao.fetchAllBooks();
		if(allBooks.size() == 0) {
			throw new BooksNotFoundException();
		}
		return allBooks;
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
	public boolean writeToFile()throws IOException {
		return bookDao.writeToFile(); // Dao impl not yet writtern
	}

}
