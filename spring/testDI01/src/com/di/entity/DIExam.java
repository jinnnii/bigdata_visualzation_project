package com.di.entity; //Model

import java.util.List;

public class DIExam implements Exam{
	private int kor;
	private int eng;
	private int math;
	private int com;
	private List<String> majors;
	
	public DIExam() {
		// TODO Auto-generated constructor stub
	}
	
	public DIExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}


	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public List<String> getMajors() {
		return majors;
	}

	public void setMajors(List<String> majors) {
		this.majors = majors;
	}

	@Override
	public int total() {
		return kor+eng+math+com;
	}
	
	@Override
	public float avg() {
		return total()/4.0f;
	}

	@Override
	public String toString() {
		return "DIExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + ", majors=" + majors + "]";
	}

	
	
	
}
