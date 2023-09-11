package com.bms.bmsspringbootrestjdbctemplatemaven.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.bms.bmsspringbootrestjdbctemplatemaven.model.BookDto;

public class BookRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookDto eachBook = new BookDto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), LocalDate.parse(rs.getString(5)), rs.getInt(6), rs.getString(7));
		return eachBook;
	}

}
