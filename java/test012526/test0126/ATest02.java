package test0126;

class A{
	void print() {
		System.out.println("Hello");
	}
	int data() {
		return 3;
	}
	double sum(int a, double b) {
		return a+b;
	}
	
	void printMonth(int m) {
		if(m<0||m>12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m+"월 입니다.");
	}
}
public class ATest02 {
	static void print() { //객체를 만들지 않고 바로 생성
		System.out.println("Hello");
	}
	
	static double sum(int i, double j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.print();
		print();
		
		int k=a.data();
		System.out.println(k);
		System.out.println(a.data());
		
		double d1 =a.sum(3,4.5);
		double d2 = sum(3, 5.4);
		System.out.println(d1);
		System.out.println(d2);
		
		a.printMonth(5);
		a.printMonth(20);
	}

}
