package test0126;

public class ThisA {
	int i;
	public ThisA() {
		System.out.println("default생성자");
	}
	public ThisA(int i) {
		this(); //생성자 호출
		//this(3,2); --> 생성자 호출2
		this.i=i;
		System.out.println("두번째 생성자");
	}
	public ThisA(int i, int j) {
		System.out.println(i+j);
	}
}
