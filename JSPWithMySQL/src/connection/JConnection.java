package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class JConnection {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/jspdatabase";
	private String usuario = "spring";
	private String senha = "spring";
	
	public Connection getConnection () {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException err) {
			throw new RuntimeException("ERROR: connection to database as not successfull", err);
		}
	}
	
	public static void closeConnection(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			}catch (SQLException err) {
				throw new RuntimeException("Error to close connection", err);
			}
		} else {
			System.out.println("Connection already closed");
		}
	}
	
	public static void closeConnection(Connection connection, PreparedStatement ps) {
		closeConnection(connection);
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException err) {
				System.err.println("Error to close prepared statement");
			}
		} else {
			System.err.println("Prepared Statement already closed ");
		}
	}
	
	public static void closeConnection (Connection connection, PreparedStatement ps, ResultSet rs) {
		closeConnection(connection, ps);
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException err) {
				System.err.println("Error to close result set");
			}
		} else {
			System.err.println("Result set already closed ");
		}
	}
}
