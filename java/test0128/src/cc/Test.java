package cc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("aa",10,"F");
		System.out.println(p1.cnt);
		Person p2 = new Person("bb",20,"M");
		System.out.println(p1.cnt);
		System.out.println(p2.cnt);
		Person p3 = new Person("cc",30,"F");
		System.out.println(p1.cnt);
		System.out.println(p2.cnt);
		System.out.println(p3.cnt);
		System.out.println(Person.cnt);
		
	}

}
