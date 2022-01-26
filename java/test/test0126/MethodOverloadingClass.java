package test0126;

public class MethodOverloadingClass {
	MethodOverloadingClass(){};
	public MethodOverloadingClass(int a) {
		//생성자 오버로딩
	}
	void print() {
		System.out.println("데이터 없음");
	}

	void print(int a) {
		System.out.println("int 데이터 : "+a);
	}

	void print(double a) {
		System.out.println("double 데이터 : "+a);
	}
	void print(int a, int b) {
		System.out.println("데이터 a+b : "+(a+b));
	}
	
	void method1(int ...values) {
		//같은 형의 데이터가 여러 개 올 때
		for(int i:values) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
