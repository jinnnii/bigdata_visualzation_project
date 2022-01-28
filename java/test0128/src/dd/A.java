package dd;

public class A {
	int a = 3;
	int b = 10;
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a =a;
	}
	public void setB(int b) {
		this.b =b;
	}
	
	public void display() {
		System.out.println("a="+a+", b="+b);
	}
	
	@Override
	public String toString() {
		return "a="+a+", b="+b;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.a ==((A)obj).a && this.b==((A)obj).b)
			return true;
		else 
			return false;
	}
}
