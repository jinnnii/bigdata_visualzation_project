package practice06;

public class Student {
	public Student(String name, int sno, String dept, int grade, double credit) {
		super();
		this.name = name;
		this.sno = sno;
		this.dept = dept;
		this.grade = grade;
		this.credit = credit;
	}

	private String name;
	private int sno;
	private String dept;
	private int grade;
	private double credit;
	
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	public void display() {
		System.out.printf("이름: %s / 학번: %d / 학과 : %s / 학년 : %d / 이수학점 : %.1f / ",
				this.name, this.sno, this.dept, this.grade, this.credit);
	}
}
