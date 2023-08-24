import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmployeeDemo {

	public static void main(String[] args) {
		// step 1 - not required
		
		// step 2 - establish connection to the DB
		String connectionUrl = "jdbc:mysql://localhost:3306/emp_dept_database";
		String userName = "root";
		String password = "root";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connectionUrl, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// step 3 - create statement and execute it
		String query = "SELECT * FROM employee_details";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query); // here the select query is submitted to the DB server, and the response is received in a ResultSet
			// traverse the rs to take out the records/data
			System.out.println("EMP_ID      EMP_NAME     DEPT_ID");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
			System.out.println("All Record fetched...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		// step 4 - handle the exceptions
		
		// step 5 - close the connection
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
