package aa;

interface C{
	void bcd();
}
public class A1 {
	B b = new B();
	void abc() {
		b.bcd();
		b.kkk();
	}
	
	class B implements C{
		@Override
		public void bcd() {
			System.out.println("익명 클래스 사용");
		}
		public void kkk() {
			System.out.println("method kkk");
		}
	}
}
