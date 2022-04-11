package com.di.entity;

import java.util.ArrayList;

public class Student {
	private String name;
	private int sno;
	private String major;
	private ArrayList<Score> scoreList;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int sno, String major, ArrayList<Score> scoreList) {
		super();
		this.name = name;
		this.sno = sno;
		this.major = major;
		this.scoreList = scoreList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sno=" + sno + ", major=" + major + ", scoreList=" + scoreList + "]";
	}
	
	
}
