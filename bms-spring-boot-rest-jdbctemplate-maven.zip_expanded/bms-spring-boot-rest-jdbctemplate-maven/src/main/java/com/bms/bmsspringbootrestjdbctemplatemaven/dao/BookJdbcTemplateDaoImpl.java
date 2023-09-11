package com.bms.bmsspringbootrestjdbctemplatemaven.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bms.bmsspringbootrestjdbctemplatemaven.dao.mapper.BookRowMapper;
import com.bms.bmsspringbootrestjdbctemplatemaven.exception.ApplicationException;
import com.bms.bmsspringbootrestjdbctemplatemaven.model.BookDto;

@Repository
public class BookJdbcTemplateDaoImpl implements BookDao {

	private JdbcTemplate jdbcTemplate;
	
//	private RowMapper<BookDto> rowMapper = (rs, noOfRows)->{
//		BookDto eachBook = new BookDto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), LocalDate.parse(rs.getString(5)), rs.getInt(6), rs.getString(7));
//		return eachBook;
//	};
	private RowMapper<BookDto> rowMapper = new BookRowMapper();
	
	@Autowired
	public BookJdbcTemplateDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<BookDto> fetchAllBooks() {
		String query = "SELECT * FROM book_details";
//		List<BookDto> allBooks = jdbcTemplate.query(query, (rs, noOfRows)->{
//			BookDto eachBook = new BookDto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), LocalDate.parse(rs.getString(5)), rs.getInt(6), rs.getString(7));
//			return eachBook;
//		});
		List<BookDto> allBooks = jdbcTemplate.query(query, rowMapper);
		return allBooks;
	}

	@Override
	public BookDto fetchABook(int bookId) {
		String query = "SELECT * FROM book_details WHERE book_id="+bookId;
//		BookDto fetchedBook = jdbcTemplate.queryForObject(query, (rs, noOfRows)->{
//			BookDto eachBook = new BookDto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), LocalDate.parse(rs.getString(5)), rs.getInt(6), rs.getString(7));
//			return eachBook;
//		});
		BookDto fetchedBook = null;
		try {
			fetchedBook = jdbcTemplate.queryForObject(query, rowMapper);
		} catch(DataAccessException dae) {
			//System.out.println(dae.getMessage());
			// rethrow DataAccessExcerption as Application exception
			throw new ApplicationException();
		}
		
		return fetchedBook;
	}

	@Override
	public BookDto addBook(BookDto newBook) {
		String query1 = "INSERT INTO book_details(book_title, book_author_id, book_genre, book_published, book_cost, book_image_url) VALUES ('"+newBook.getBookTitle()+"', "+newBook.getBookAuthurId()+", '"+newBook.getBookGenre()+"', '"+newBook.getBookPublished()+"', "+newBook.getBookCost()+", '"+newBook.getBookImageUrl()+"');";
		int rowsAffected = jdbcTemplate.update(query1);
		
		String query2 = "SELECT last_insert_id()";
		int generateBookId = jdbcTemplate.queryForObject(query2, (rs, rowNum)->{
			return rs.getInt(1);
		});
		
		newBook.setBookId(generateBookId);
		return newBook;
	}

	@Override
	public BookDto updateBook(BookDto updateBook) {
		String query = "UPDATE book_details SET book_title=?, book_cost=?, book_image_url=?, book_genre=? WHERE book_id=?";
		int rowsAffected = jdbcTemplate.update(query, updateBook.getBookTitle(), updateBook.getBookCost(), updateBook.getBookImageUrl(), updateBook.getBookGenre(), updateBook.getBookId());
		return updateBook;
	}

	@Override
	public void removeBook(int bookId) {
		// if we use query1 spring jdbctemplate uses Statement internally
		//String query1 = "DELETE FROM book_details WHERE book_id="+bookId;
		//jdbcTemplate.update(query1);
		
		// if we use query2 spring jdbctemplate uses PreparedStatement internally
		// PreparedStatements are precompiled statement - compiled once and executed many times
		String query2 = "DELETE FROM book_details WHERE book_id=?";
		jdbcTemplate.update(query2,bookId);
	}

	@Override
	public List<BookDto> fetchBooksByGenre(String genre) {
		String query = "SELECT * FROM book_details WHERE book_genre='"+genre+"'";
		List<BookDto> fetchedBooksByGenre = jdbcTemplate.query(query, rowMapper);
		return fetchedBooksByGenre;
	}
	
	

}
