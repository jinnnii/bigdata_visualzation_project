package practice06;

public class Customer extends Person{

	private int id;
	private int point;
	
	public Customer() {}
	public Customer(int id, int point) {
		super();
		this.id = id;
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	public void display() {
		super.display();
		System.out.printf(" 아이디:%d 마일리지:%d",this.id, this.point);
	}
	
}
