package com.bms.bmsspringbootrestjdbcmaven.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bms.bmsspringbootrestjdbcmaven.dao.mappers.AuthorMapper;
import com.bms.bmsspringbootrestjdbcmaven.dao.mappers.BookMapper;
import com.bms.bmsspringbootrestjdbcmaven.dao.util.DBUtil;
import com.bms.bmsspringbootrestjdbcmaven.model.AuthorDto;
import com.bms.bmsspringbootrestjdbcmaven.model.BookDto;

@Repository
public class BookDaoJdbcImpl implements BookDao {

	@Override
	public List<BookDto> fetchAllBooks() {
		List<BookDto> allBooks = null;
		String query = "SELECT * FROM book_details";
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query); 
			allBooks = BookMapper.copyResultSetToDto(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allBooks;
	}

	@Override
	public BookDto fetchABook(int bookId) {
		List<BookDto> fetchedBook = null;
		String query = "SELECT * FROM book_details WHERE book_id="+bookId;
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			fetchedBook = BookMapper.copyResultSetToDto(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(fetchedBook.size()!=0) {
			return fetchedBook.get(0);
		}
		return null;
	}

	@Override
	public BookDto addBook(BookDto newBook) {
		String query1 = "INSERT INTO book_details(book_title, book_author_id, book_genre, book_published, book_cost, book_image_url) VALUES ('"+newBook.getBookTitle()+"', "+newBook.getBookAuthurId()+", '"+newBook.getBookGenre()+"', '"+newBook.getBookPublished()+"', "+newBook.getBookCost()+", '"+newBook.getBookImageUrl()+"');";
		String query2 = "SELECT last_insert_id();";
		
		Connection conn = DBUtil.obtainConnection();
		
		try {
			Statement stmt = conn.createStatement();
			
			int rowsAffected = stmt.executeUpdate(query1);
			ResultSet rs = stmt.executeQuery(query2);
			if(rs.next()) {
				newBook.setBookId(rs.getInt(1)); // this takes out the last inserted id from the rs and sets it inot the dto
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newBook;
	}

	@Override
	public BookDto updateBook(BookDto updateBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		String query = "DELETE FROM book_details WHERE book_id="+bookId;
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			int rowsAffected = stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<BookDto> fetchBooksByGenre(String genre) {
		List<BookDto> allBooksByGenre = null;
		String query = "SELECT * FROM book_details WHERE book_genre='"+genre+"'";
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query); 
			allBooksByGenre = BookMapper.copyResultSetToDto(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allBooksByGenre;
	}

}
