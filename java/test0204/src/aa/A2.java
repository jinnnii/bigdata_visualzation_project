package aa;
public class A2 {
	C b = new C() {
		//인터페이스는 밖에서 호출 못하고 안에서만 호출 가능
		@Override
		public void bcd() {
			System.out.println("익명클래스 예제2");
			kkk();
		}
		
		public void kkk() {
			System.out.println("method kkk");
		}
		
	};
	void abc() {
		b.bcd();
		//b.kkk();
	}
}
