package challenge;

public class Seat {
	private String group;
	private String name;
	private int number;
	
	public Seat() {}
	public Seat(String group, String name,int number) {
		this.group = group;
		this.name = name;
		this.number = number;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
