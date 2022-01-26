package test0124;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		int rank = 1;

		String rt;
		switch (rank) {
		case 1:
			rt = "G";
			break;
		case 2:
			rt = "S";
			break;
		case 3:
			rt = "B";
			break;
		default:
			rt = "매달 없음";
			break;
		}

		System.out.println(rt);

		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요.");
		int month = sc.nextInt();
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;

		default:
			System.out.println("잘못된 달을 입력하셨습니다.");
			break;
		}
		sc.close();
	}

}
