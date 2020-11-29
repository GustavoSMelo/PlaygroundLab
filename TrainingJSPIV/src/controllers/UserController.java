package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DatabaseConnection;
import models.UserModel;

public class UserController {
	DatabaseConnection dbc = new DatabaseConnection();
	
	public UserController () {}
	
	public void Store (UserModel newUser) {
		Connection conn = dbc.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement("INSERT INTO users (id, name, password) VALUES (?, ?, ?)");
			ps.setLong(1, newUser.getID());
			ps.setString(2, newUser.getName());
			ps.setString(3, newUser.getPassword());
			
			ps.executeUpdate();
		} catch (SQLException err) {
			throw new RuntimeException("Error to insert a new user in database");
		} finally {
			dbc.closeConnection(conn, ps);
		}
	}
	
	public ArrayList<UserModel> Index() {
		Connection conn = dbc.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement("SELECT * FROM users");
			rs = ps.executeQuery();
			
			ArrayList<UserModel> arry = new ArrayList<UserModel>();
			
			while (rs.next()) {
				UserModel tmpUser = new UserModel(rs.getLong("id"), rs.getString("name"), rs.getString("password"));
				
				arry.add(tmpUser);
			}
			
			return arry;
			
		} catch (SQLException err) {
			throw new RuntimeException("Error to get all users from database ");
		} finally {
			dbc.closeConnection(conn, ps, rs);
		}
	}
}
