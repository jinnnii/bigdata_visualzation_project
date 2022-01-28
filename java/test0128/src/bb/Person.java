package bb;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println("name:"+name+" age:"+age+" gender:"+gender );
	}
}
