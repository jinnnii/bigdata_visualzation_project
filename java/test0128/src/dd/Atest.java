package dd;

public class Atest {

	public static void main(String[] args) {
		A aa = new A();
		A bb = new A();
		aa.display();
		System.out.println("a="+aa.getA()+", b="+aa.getB());
		
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
	}

}
