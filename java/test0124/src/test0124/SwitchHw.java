package test0124;

import java.util.Scanner;

public class SwitchHw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 2개 입력하세요");
		int fNum = sc.nextInt();
		int sNum = sc.nextInt();

		System.out.println("원하는 사칙연산을 입력하세요");
		String op = sc.next();

		int result = 0;
		switch (op) {
		case "+":
			result = fNum + sNum;
			break;
		case "-":
			result = fNum - sNum;
			break;
		case "*":
			result = fNum * sNum;
			break;
		case "/":
			result = fNum / sNum;
			break;
		case "%":
			result = fNum % sNum;
			break;
		default:
			System.out.println("잘못된 사칙연산 입니다.");
			break;

		}
		System.out.println("결과 값:" + result);
		sc.close();
	}

}
