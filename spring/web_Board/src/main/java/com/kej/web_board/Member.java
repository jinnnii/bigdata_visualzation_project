package com.kej.web_board;

public class Member {
	private String id;
	private String pw;
	private String phone;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	
	public Member(String id, String pw, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.phone = phone;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", phone=" + phone + "]";
	}
	
	
}
