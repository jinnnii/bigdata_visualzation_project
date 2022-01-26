package test0124;

public class Optest01 {

	public static void main(String[] args) {
		//산술 연산자
		int a = 10;
		int b = 4;

		System.out.println("a+b:" + (a + b));
		System.out.println("a-b:" + (a - b));
		System.out.println("a*b:" + (a * b));
		System.out.println("a/b:" + ((float) a / b));
		System.out.println("a%b:" + (a % b));
		System.out.println("a++:" + (a++));//10
		System.out.println("a--:" + (a--));//11
		System.out.println("++a:" + (++a));//11
		System.out.println("--a:" + (--a));//10

	}

}
