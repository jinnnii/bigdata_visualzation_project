package com.kej.webmvc.entity;

public class Board {
	private int bno;
	private String title;
	private String writer;
	private String content;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int bno, String title, String writer, String content) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + "]";
	}
	
	
}
