package com.example.educationalloan.model;

public class AdminModel {

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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	private String password;
	private String mobilenumber;
	private String userrole;
	public AdminModel() {
		super();
	}
	public AdminModel(String email, String password, String mobilenumber, String userrole) {
		super();
		this.email = email;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.userrole = userrole;
	}
	@Override
	public String toString() {
		return "AdminModel [email=" + email + ", password=" + password + ", mobilenumber=" + mobilenumber
				+ ", userrole=" + userrole + "]";
	}
	
}
