package com.bms.bmsspringbootrestjdbcmaven.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bms.bmsspringbootrestjdbcmaven.dao.mappers.AuthorMapper;
import com.bms.bmsspringbootrestjdbcmaven.dao.util.DBUtil;
import com.bms.bmsspringbootrestjdbcmaven.model.AuthorDto;

//@Component
@Repository
public class AuthorDaoJdbcImpl implements AuthorDao{

	@Override
	public List<AuthorDto> fetchAllAuthors() {
		List<AuthorDto> allAuthors = null;
		String query = "SELECT * FROM author_details";
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query); // this rs has all the author record in it
			// now we have to copy the contents of the rs into a collection of AuthorDto
			// AuthorMapper does this for us
			allAuthors = AuthorMapper.copyResultSetToDto(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allAuthors;
	}

	@Override
	public AuthorDto fetchAAuthor(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorDto addAuthor(AuthorDto newAuthor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorDto updateAuthor(AuthorDto updateAuhtor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAuthor(int authorId) {
		//step 3,4
		String query = "DELETE FROM author_details WHERE author_id="+authorId;
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			int rowsAffected = stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
