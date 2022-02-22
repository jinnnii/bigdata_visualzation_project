package com.board.dto;

import java.sql.Timestamp;

public class BoardVO {
	//DTO : data transfer object
	//VO :  value object
	//DB에 있는 내용을 클래스 멤버변수로 선언하는 것으로 
	//이름은 다르나 행위는 비슷하다.
	
	private int num;
	private String name;
	private String email;
	private String pass;
	private String title;
	private String content;
	private int readCount;
	private Timestamp whitedate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public Timestamp getWhitedate() {
		return whitedate;
	}
	public void setWhitedate(Timestamp whitedate) {
		this.whitedate = whitedate;
	}
	
	
}
