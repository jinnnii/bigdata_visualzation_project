package aa;

public class AnonymousTest {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.abc();
		
		A1.B b= a1.new B();
		b.bcd();
		b.kkk();
		
		A2 a2 = new A2();
		a2.abc();
		
		//A2.C c= new a2.new C() 인터페이스이기때문
	}

}
