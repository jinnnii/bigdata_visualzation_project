package cc;

interface A {
	void abc();
}

class B implements A {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("추상메서드 abc()");
	}

}

public class C {
	void cde(A a){
		a.abc();
	}
}
