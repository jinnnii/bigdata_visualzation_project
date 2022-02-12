package aa;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<Person> aList = new ArrayList<Person>();
		//ArrayList<Person> aList2 = new ArrayList<Person>();
		aList.add(new Person("공심이",20,"남자","010-1234-5678"));
		aList.add(new Person("둘리",10,"남자","010-4562-8878"));
		aList.add(new Person("도우너",25,"여자","010-5678-2345"));
		aList.add(new Person("지우개",25,"남자","010-4567-2224"));
		aList.add(0, new Person("또치",10,"남자","010-8978-5645"));
		aList.set(1, new Person("공실이",19,"여자","010-1234-5678"));
		aList.remove(4);
		
		for(Person p : aList) {
			System.out.println(p);
		}
		System.out.println("------------------------------");
		Person[] persons= aList.toArray(new Person[0]);
		for(Person p : persons) {
			System.out.println(p);
		}
		
	}

}
