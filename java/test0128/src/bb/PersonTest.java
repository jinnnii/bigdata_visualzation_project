package bb;

public class PersonTest {
	
	static void func(Person p) {
		p.display();
		if(p instanceof Employee) {
			Employee e = (Employee)p;
			e.test();
		}
	}

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("홍길동",10,"남");
		persons[1] = new Student("홍사람",20,"여",1,"컴공");
		persons[2] = new Employee("홍길치",59,"남",33,"영업부",500);

		for(Person p: persons) {
			p.display();
			System.out.println();
		}
		
		//persons[2].displayEmp(); //error
		
		Person e1 = new Employee("홍길치",59,"남",33,"영업부",500);
		Employee e2 = (Employee)e1;
		e2.test();
		
		Person p1 = new Person("홍길동",10,"남");
		func(p1);
		Person p2  = new Student("홍사람",20,"여",1,"컴공");
		Person p3  = new Employee("홍길치",59,"남",33,"영업부",500);

	}

}
