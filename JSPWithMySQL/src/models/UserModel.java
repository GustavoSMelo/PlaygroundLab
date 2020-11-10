package models;

public final class UserModel {
	//attributes
	private Long id;
	private String name;
	private String email;
	private String password;
	
	//constructors
	public UserModel () {}
	public UserModel (Long id, String name, String password, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	//getters
	public Long getID () {
		return this.id;
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getEmail () {
		return this.email;
	}
	
	public String getPassword () {
		return this.password;
	}
	
	//setters
	public void setID (Long id) {
		this.id = id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
}
