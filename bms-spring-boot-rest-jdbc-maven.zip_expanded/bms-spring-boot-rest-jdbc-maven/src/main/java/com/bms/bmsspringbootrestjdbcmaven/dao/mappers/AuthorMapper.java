package com.bms.bmsspringbootrestjdbcmaven.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bms.bmsspringbootrestjdbcmaven.model.AuthorDto;

public class AuthorMapper {
	
	public static List<AuthorDto> copyResultSetToDto(ResultSet rs) {
		// here we have to copy the contents of the ResultSet into a collection and return the collection
		List<AuthorDto> allAuthors = new ArrayList<AuthorDto>();
		try {
			while(rs.next()) {
				AuthorDto author = new AuthorDto(rs.getInt(1), rs. getString(2), rs.getString(3));
				allAuthors.add(author);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allAuthors;
	}

}
