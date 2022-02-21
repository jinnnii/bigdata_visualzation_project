package practice06;

public class Melon extends Food{
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public void display() {
		super.display();
		System.out.println("정보:"+this.info);
	}
}
