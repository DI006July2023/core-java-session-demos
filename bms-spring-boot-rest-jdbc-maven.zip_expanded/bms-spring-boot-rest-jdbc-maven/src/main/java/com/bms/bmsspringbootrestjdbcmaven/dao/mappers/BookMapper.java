package com.bms.bmsspringbootrestjdbcmaven.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bms.bmsspringbootrestjdbcmaven.model.BookDto;

public class BookMapper {
	public static List<BookDto> copyResultSetToDto(ResultSet rs) {
		// here we have to copy the contents of the ResultSet into a collection and return the collection
		List<BookDto> allBooks = new ArrayList<BookDto>();
		try {
			while(rs.next()) {
				BookDto book = new BookDto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), LocalDate.parse(rs.getString(5)), rs.getInt(6), rs.getString(7));
				allBooks.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allBooks;
	}
}
