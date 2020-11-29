package models;

public class UserModel {
	private Long id;
	private String name;
	private String password;
	
	public UserModel () {}
	
	public UserModel (Long id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public Long getID() {
		return this.id;
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getPassword () {
		return this.password;
	}
}
