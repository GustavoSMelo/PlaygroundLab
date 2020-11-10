package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.JConnection;
import models.UserModel;

public class UserController {
	JConnection jConnection = new JConnection();
	
	public UserController () {}
	
	public void Store (UserModel user) {
		Connection connection = jConnection.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = connection.prepareStatement("INSERT INTO users (id, name, email, password) VALUES (?, ?, ?, ?)");
			ps.setLong(1, user.getID());
			ps.setString(2, user.getName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			
			ps.executeQuery();
		} catch (SQLException err) {
			System.err.println("Error to Store a new user in database");
		} finally {
			jConnection.closeConnection(connection, ps);
		}
	}
	
	public ArrayList<UserModel> Index() {
		Connection connection = jConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement("SELECT * FROM users");
			rs = ps.executeQuery();
			
			ArrayList arry = new ArrayList<UserModel>();
			while (rs.next()) {
				UserModel user = new UserModel(rs.getLong("id"), rs.getString("name"), rs.getNString("password"), rs.getNString("email"));
				
				arry.add(user);
			}
			
			return arry;
		} catch (SQLException err) {
			System.err.println("Error to get all users in database");
			ArrayList arry = new ArrayList<UserModel>();
			return arry;
		} finally {
			jConnection.closeConnection(connection, ps, rs);
		}
	}
	
	public void Update (UserModel user) {
		Connection connection = jConnection.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = connection.prepareStatement("UPDATE users SET name = ?, email = ?, password = ? WHERE id = ?");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setLong(4, user.getID());
			
			ps.executeUpdate();
			System.out.print("User updated with success ");
		} catch (SQLException err) {
			System.err.println("Error to update user");
		} finally {
			jConnection.closeConnection(connection, ps);
		}
	}
	
	public void Destroy(Long id) {
		Connection connection = jConnection.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = connection.prepareStatement("DELETE * FROM users WHERE id = ?");
			ps.setLong(1, id);
			ps.executeUpdate();
		} catch (SQLException err) {
			System.err.println("Error to delete user ");
		} finally {
			jConnection.closeConnection(connection, ps);
		}
	}
	
	public UserModel Show (String email, String password) {
		Connection connection = jConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			UserModel usr = new UserModel();
			while(rs.next()) {
				usr.setID(rs.getLong("id"));
				usr.setName(rs.getString("name"));
				usr.setEmail(rs.getString("email"));
				usr.setPassword(rs.getString("password"));
			}
			
			return usr;
		} catch (SQLException err) {
			UserModel usr = new UserModel();
			System.err.println("Error, User not found");
			return usr;
		} finally {
			JConnection.closeConnection(connection, ps, rs);
		}
	} 
}
