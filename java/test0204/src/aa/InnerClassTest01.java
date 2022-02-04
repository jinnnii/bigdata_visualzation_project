package aa;

public class InnerClassTest01 {

	public static void main(String[] args) {
		A a = new A();
		a.abc();
		A.B b = a.new B();
//		b.bcd();
		
		A.C c = new A.C();
//		c.bcd();

	}

}
