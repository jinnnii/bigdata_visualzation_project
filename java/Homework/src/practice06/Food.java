package practice06;

public class Food {
	private int cal;
	private int cost;
	private int kg;
	
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public void display() {
		System.out.println("칼로리:"+this.cal);
		System.out.println("가격:"+this.cost);
		System.out.println("중량:"+this.kg);
	}
}
