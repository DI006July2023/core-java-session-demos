import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployeeDemo {

	public static void main(String[] args) {
		// step 1 - Load the driver (not required)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// step 2 - establish connection to the DB
		String connectionUrl = "jdbc:mysql://localhost:3306/emp_dept_database"; 
			// jdbc:mysql: - protocol
			// localhost - ipaddress of the server
			// 3306 - port number in which the DB server is listening
			// emp_dept_database - the database which has be connected/use to 
		String userName = "root";
		String password = "root";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connectionUrl, userName, password);
			System.out.println("Connection established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// step 3 - create a statement and execute it
		String query = "INSERT INTO employee_details VALUES(506, 'TRIAL', 101)";
		try {
			Statement stmt = conn.createStatement();
			int rowsAffected = stmt.executeUpdate(query);
			System.out.println(rowsAffected + " row(s) are affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// step 4 - handle the exceptions
		
		// step 5 - close the connection
		try {
			conn.close();
			System.out.println("Connection closed...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
