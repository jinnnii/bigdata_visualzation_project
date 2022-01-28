package bb;

public class Student extends Person{
	private int sno;
	private String major;
	
	public Student() {}
	public Student(String name, int age, String gender, int sno, String major) {
		super(name, age, gender);
		this.sno = sno;
		this.major = major;
	}
	
	public void display() {
		super.display();
		System.out.println("sno:"+sno+" major:"+major);
	}
}
