package cc;

public class Ctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1= new C();
		A a1= new B();
		c1.cde(a1);
		
		C c2= new C();
		c2.cde(new B());
		
		C c3 = new C();
		A a = new A() {
			@Override
			public void abc() {
				// TODO Auto-generated method stub
				System.out.println("익명으로 메소드 구현");
			}
		};
		c3.cde(a);
		
		C c4 = new C();
		c4.cde(new A() {
			@Override
			public void abc() {
				System.out.println("익명 참조변수 없이 사용");
			}
		});
	}

}
