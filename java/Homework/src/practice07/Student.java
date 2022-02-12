package practice07;

class Student{
	private String name;
	private String dept;
	private int sno;
	private double score;
	
	public Student() {}
	public Student(String name, String dept, int sno, double score) {
		super();
		this.name = name;
		this.dept = dept;
		this.sno = sno;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return  name + "," + dept + ", " + sno + ", " + score;
	}
}
