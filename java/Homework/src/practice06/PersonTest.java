package practice06;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("홍길동","부산시","010-1234-5678");
		Customer customer = new Customer();
		customer.setName("홍길미");
		customer.setAddr("서울시");
		customer.setPhone("010-2345-6789");
		customer.setId(1);
		customer.setPoint(1000);
		
		person.display();
		System.out.println();
		customer.display();
	}

}

