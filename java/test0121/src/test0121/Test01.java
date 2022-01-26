package test0121;

//int outerClass = 1; 클래스 외부에서는 함수나 변수 선언 및 사용이 안됨
public class Test01 {
	int innerClass = 5;

	// SumFunc = innerClass+1; 명령문들은 반드시 함수 내에서 실행되어야 함
	public static void main(String[] args) {
		int n1 = 20;
		int n2;
		char c;

		n2 = sum(n1, 10);
		c = '?';
		System.out.println(n2);
		System.out.println("Hello");
		System.out.println(c);
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

}
