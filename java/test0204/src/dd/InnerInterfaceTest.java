package dd;

public class InnerInterfaceTest {

	public static void main(String[] args) {
		C c = new C();
		c.bcd();
		A.B c2 = new C();
		c2.bcd();
		
		A.B c3 = new A.B() {
			@Override
			public void bcd() {
				System.out.println("익명으로 구현한 A.B인터페이스의 bcd 메소드");
			}
		};
		c3.bcd();
	}

}
