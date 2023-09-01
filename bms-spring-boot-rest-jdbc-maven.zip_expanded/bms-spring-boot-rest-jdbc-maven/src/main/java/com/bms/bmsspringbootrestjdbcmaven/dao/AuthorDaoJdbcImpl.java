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
		List<AuthorDto> fetchedAuthor = null;
		String query = "SELECT * FROM author_details WHERE author_id="+authorId;
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			fetchedAuthor = AuthorMapper.copyResultSetToDto(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(fetchedAuthor.size()!=0) {
			return fetchedAuthor.get(0);
		}
		return null;
	}

	@Override
	public AuthorDto addAuthor(AuthorDto newAuthor) {
		String query1 = "INSERT INTO author_details(author_first_name, author_last_name) VALUE ('"+newAuthor.getAuthorFirstName()+"', '"+newAuthor.getAuthorLastName()+"');";
		String query2 = "SELECT last_insert_id();";
		
		Connection conn = DBUtil.obtainConnection();
		
		try {
			Statement stmt = conn.createStatement();
			
			int rowsAffected = stmt.executeUpdate(query1);
			ResultSet rs = stmt.executeQuery(query2);
			if(rs.next()) {
				newAuthor.setAuthorId(rs.getInt(1)); // this takes out the last inserted id from the rs and sets it inot the dto
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newAuthor;
	}

	@Override
	public AuthorDto updateAuthor(AuthorDto updateAuthor) {
		String query = "UPDATE author_details SET author_first_name='"+updateAuthor.getAuthorFirstName() +"', author_last_name='"+updateAuthor.getAuthorLastName()+"' WHERE author_id="+updateAuthor.getAuthorId();
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			
			int rowsAffected = stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return updateAuthor;
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

	@Override
	public List<AuthorDto> fetchAuthorsByFirstName(String firstName) {
		List<AuthorDto> allAuthorsByFirstName = null;
		String query = "SELECT * FROM author_details WHERE author_first_name='"+firstName+"'";
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query); // this rs has all the author record in it
			// now we have to copy the contents of the rs into a collection of AuthorDto
			// AuthorMapper does this for us
			allAuthorsByFirstName = AuthorMapper.copyResultSetToDto(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allAuthorsByFirstName;
	}

}
