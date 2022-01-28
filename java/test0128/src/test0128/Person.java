package test0128;
class Employee{
	private int emp;
	String name;
	protected String position;
	public String dept;
}

public class Person {
	private String name;//class 내부에서만 사용 가능
	int age; //default 접근제어자, 같은 패키지 내부에서 사용
	protected String gender;//같은 패키지 내부와 상속받은 클래스에서 사용 가능
	public String addr;// 모든 곳에서 사용 가능
	
	public Person() {}//default;

	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age, String gender, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void display() {
		System.out.println("display");
	}
	
	
}
