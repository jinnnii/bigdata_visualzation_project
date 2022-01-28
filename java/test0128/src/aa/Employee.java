package aa;

import test0128.Person;

public class Employee extends Person {
	private int empno;
	private String position;
	private String dept;
	private int sal;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String gender, String addr
			, int empno,String position, String dept, int sal) {
		super(name, age, gender, addr);
		//this.gender = gender; //protected
		//this.addr = addr; //public
		this.empno = empno;
		this.position = position;
		this.dept = dept;
		this.sal = sal;
	}
	
	public void display() {//오버라이딩
		super.display();
		System.out.println(empno+" "+position+" "+dept+" "+sal);
	}

}
