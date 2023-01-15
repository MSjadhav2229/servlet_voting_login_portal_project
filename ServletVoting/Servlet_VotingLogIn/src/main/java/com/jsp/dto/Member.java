package com.jsp.dto;

public class Member {
	
	private String uname,password,email,phone,uname1;

	public Member() {
		super();
	}
	

	public Member(String uname1) {
		super();
		this.uname1 = uname1;
	}


	public Member(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}


	public Member(String uname, String password, String email, String phone) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getUname1() {
		return uname1;
	}


	public void setUname1(String uname1) {
		this.uname1 = uname1;
	}
	
	


}
