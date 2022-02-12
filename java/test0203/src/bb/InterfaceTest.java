package bb;

public class InterfaceTest {

	public static void main(String[] args) {
//		A a = new A(); //abstract
		System.out.println(A.a); //static
//		A.a =4; //final
		
		A a1 = new A1();
		a1.abc();
		
		A ab = new AB();
		ab.abc();
		//ab.bcd();
		
		D d = new D();
		d.abc();
		d.bcd();
		d.func();
	}

}
