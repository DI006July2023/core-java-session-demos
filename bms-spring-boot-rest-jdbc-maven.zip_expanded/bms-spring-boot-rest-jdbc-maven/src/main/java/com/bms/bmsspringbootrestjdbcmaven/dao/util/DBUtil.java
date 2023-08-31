package com.bms.bmsspringbootrestjdbcmaven.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
// here we will have step1, step2 and step5
	
	static Connection conn;
	
	// step 1 - Load the Driver
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// step 2 - establish connection
	// here we will use singleton design pattern to make sure that at any point there is only one connection
	public static Connection obtainConnection() {
		String connectionUrl = "jdbc:mysql://localhost:3306/book_management_system"; 
		
		String userName = "root";
		String password = "root";
	
		try {
			if(conn == null) {
				conn = DriverManager.getConnection(connectionUrl, userName, password);
			}
			//System.out.println("Connection established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	// step 5 - close connection
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
