package aa;

import test0128.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setGender("남자");
		p1.addr = "부산시 부산진구";
		
		p1.display();
		
		Employee e1= new Employee("홍수동",35,"남","부산",1,"과장","영업",500);
		e1.display();
	}
}
