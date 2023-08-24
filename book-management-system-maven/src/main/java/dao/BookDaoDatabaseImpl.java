package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.BookPojo;

public class BookDaoDatabaseImpl implements BookDao {

	@Override
	public BookPojo addBook(BookPojo newBook) {
		
		// step 3
		// step 4
		
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		
		String query = "UPDATE book_details SET book_cost="+updateBook.getBookCost()+ "WHERE book_id="+updateBook.getBookId();
		Connection myConn = DBUtil.obtainConnection();
		try {
			Statement stmt = myConn.createStatement();
			stmt.executeUpdate(query); // here we are not capturing the return int value as we are not using it
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updateBook;
	}

	@Override
	public void removeBook(int bookId) {
		// step 3
		String query = "DELETE FROM book_details WHERE book_id="+bookId;
		Connection myConn = DBUtil.obtainConnection();
		try {
			Statement stmt = myConn.createStatement();
			stmt.executeUpdate(query); // here we are not capturing the return int value as we are not using it
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		String query = "SELECT * FROM book_details";
		Connection myConn = DBUtil.obtainConnection(); 
		Statement stmt = null;
		List<BookPojo> allBooks = new ArrayList<BookPojo>();
		try {
			stmt = myConn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				BookPojo eachBook = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), LocalDate.parse(rs.getString(5)), rs.getInt(6), rs.getString(7));
				allBooks.add(eachBook);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allBooks;
	}

	@Override
	public BookPojo fetchById(int bookId) {
		String query = "SELECT * FROM book_details WHERE book_id="+bookId;
		Connection myConn = DBUtil.obtainConnection(); 
		Statement stmt = null;
		BookPojo fetchedBook = null; 
		try {
			stmt = myConn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				fetchedBook = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), LocalDate.parse(rs.getString(5)), rs.getInt(6), rs.getString(7));
				return fetchedBook;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fetchedBook;
	}

	@Override
	public List<BookPojo> fetchByGenre(String bookGenre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean writeToFile() throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

}
