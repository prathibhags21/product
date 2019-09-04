package com.prod.app.dto;



public class UserDTO {
	
	
	private int id;
	private String userName;
	private String password;
	
	public UserDTO() {
		System.out.println("userDTO created "+this.getClass().getSimpleName());
	}
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
