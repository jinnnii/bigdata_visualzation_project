package aa;

import bb.BB;

public class PackageTest {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.i = 10;
		aa.func1();
		
		A1 a1 = new A1();
		a1.j = 10;
		a1.func1();
		
		BB bb = new BB();
		//bb.i = 10; //default일 때, 다른 패키지에서는 접근 불가
		bb.func1();
		
		//default 이기 때문
//		B1 b1 = new B1();
//		b1.j = 10;
//		b1.func1();
	}
}
