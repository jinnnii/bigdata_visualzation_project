package practice06;

public class Person {

	private String name;
	private String addr;
	private String phone;
	
	public Person() {}
	public Person(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void display() {
		System.out.printf("이름:%s 주소:%s 전화번호:%s",this.name,this.addr,this.phone);
	}
	
}
