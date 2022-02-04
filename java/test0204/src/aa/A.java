package aa;
public class A {
	public int a = 3;
	protected int b=4;
	int c = 5;
	private int d= 6;
	
	static int e = 7;
	
	void abc() {
		int f =8;
		System.out.println("A Class Method");
		
		class D{
			void cde() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
			}
		}
		D d = new D();
		d.cde(); //3,4,5,6,7,8
	}
	
	class B{
		int a=10;
		int b=20;
		void bcd(){
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
//			System.out.println(d);
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			abc();
		}
	}
	static void method2() {
		System.out.println("A class static method");
	}
	static class C{
		void bcd() {
			//System.out.println(a);
			System.out.println(e);
			System.out.println("Static inner class");
			//abc();
			method2();
		}
	}
}
