package com.example.educationalloan.model;


public class LoginModel {


	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	public LoginModel() {
		super();
	}
	public LoginModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginModel [email=" + email + ", password=" + password + "]";
	}
}
