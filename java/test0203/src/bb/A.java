package bb;

public interface A {
	int a = 3;
	void abc();
}

interface B{
	int b=3;
	void bcd();
}

class C{
	void func() {
		System.out.println("C의 메소드");
	}
}
class A1 implements A{
	@Override
	public void abc() {
		System.out.println("A1");
	}
}

class AB implements A,B{
	@Override
	public void bcd() {
		System.out.println("Bclass");
	}
	@Override
	public void abc() {
		System.out.println("Aclass");
	}
}

class D extends C implements A,B{

	@Override
	public void bcd() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abc() {
		// TODO Auto-generated method stub
	}
	void func() {
		super.func();
		System.out.println("D의 메소드");
	}
}