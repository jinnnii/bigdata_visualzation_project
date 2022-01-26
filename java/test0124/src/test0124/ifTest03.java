package test0124;

import java.util.Scanner;

public class ifTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력");
		int score = sc.nextInt();

//		if (score >= 90) {
//			System.out.println("A학점");
//		} else if (score >= 80) {
//			System.out.println("B학점");
//		} else if (score >= 70) {
//			System.out.println("C학점");
//		} else {
//			System.out.println("F학점");
//		}

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점");break;
		case 8:
			System.out.println("B학점");break;
		case 7:
			System.out.println("C학점");break;
		default: 
			System.out.println("F학점");break;
		}
		sc.close();
	}

}
