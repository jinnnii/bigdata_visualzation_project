package cc;

public class Employee extends Person{
	private int eno;
	private String dept;
	private int sal;
	
	public Employee() {}
	public Employee(String name, int age, String gender, int eno,String dept, int sal) {
		super(name, age, gender);
		this.eno = eno;
		this.dept = dept;
		this.sal =sal;
	}
	
	public void display() {
		super.display();
		System.out.println("eno:"+eno+" dept:"+dept+ " sal:"+sal);
	}
	
	public void displayEmp() {
		super.display();
		System.out.println("eno:"+eno+" dept:"+dept+ " sal:"+sal);
	}
//	public void func() {
//		System.out.println("static method overriding");
//	}
	public void test() {
		System.out.println("다운캐스팅 실습");
	}
	
}
