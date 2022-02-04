package dd;

public class A {
	public void abc() {
		System.out.println("A class abc method");
	}
	
	static interface B{
		void bcd();
	}
}

class C implements A.B{
	@Override
	public void bcd() {
		System.out.println("B->C class method bcd");
	}
}