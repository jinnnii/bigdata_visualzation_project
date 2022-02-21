package practice06;

public class Phone {
	public Phone() {}
	public Phone(String make, int price, String cmType) {
		super();
		this.make = make;
		this.price = price;
		this.cmType = cmType;
	}
	private String make;
	private int price;
	private String cmType;
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCmType() {
		return cmType;
	}
	public void setCmType(String cmType) {
		this.cmType = cmType;
	}
	
	
}
