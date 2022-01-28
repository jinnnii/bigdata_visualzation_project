package cc;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	static int cnt; 
	
	public static void func() {
		System.out.println(cnt);
//		System.out.println(name);//error
	}
	
	public Person() {}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		cnt++;
	}
	
	public void display() {
		System.out.println("name:"+name+" age:"+age+" gender:"+gender );
	}
}
