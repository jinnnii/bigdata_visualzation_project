package bb;

import java.util.Arrays;

public class Student implements Comparable<Student>{
	private int sno;
	private String name;
	private String major;
	private int[] scores = new int[3];
	
	public Student() {}
	public Student(int sno, String name, String major, int[] scores) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.scores = scores;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", major=" + major + ", scores=" + Arrays.toString(scores)
				+ "]";
	}
	@Override
	public int compareTo(Student o) { //make comparable element
		// TODO Auto-generated method stub
		if(sno<o.sno) {
			return -1;
		}else if(sno==o.sno) {
			return 0;
		}else {
			return 1;
		}
	}
	
	
	
}
