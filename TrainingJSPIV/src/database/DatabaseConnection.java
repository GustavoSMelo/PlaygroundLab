package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String USER = "gustavomelo";
	private final String PASSWORD = "123456";
	private final String URL = "jdbc:mysql://localhost:3306/dbreview";
	
	public DatabaseConnection () { }
	
	public Connection getConnection () {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
		} catch (ClassNotFoundException | SQLException err) {
			throw new RuntimeException("Error in driver " + err);
		}
	}
	
	public void closeConnection (Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			} 
		} catch (SQLException err) {
			throw new RuntimeException("Error to close connection");
		}
	}
	
	
	public void closeConnection (Connection connection, PreparedStatement ps) {
		this.closeConnection(connection);
		
		try {
			if(ps != null) {
				ps.close();
			}
		} catch (SQLException err) {
			throw new RuntimeException("Error to close prepared statement");
		}
	}
	
	public void closeConnection (Connection connection, PreparedStatement ps, ResultSet resultSet) {
		this.closeConnection(connection, ps);
		
		try {
			resultSet.close();
		} catch (SQLException err) {
			throw new RuntimeException("Error to close resultSet");
		}
	}
}
