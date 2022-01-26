package test0126;

public class Car {
	String color;
	int year;

	public Car() {// 생성자
	}

	public Car(String c, int y) {
		color = c;
		year = y;
	}

	public void display() {
		System.out.println(color);
		System.out.println(year);
	}
}
