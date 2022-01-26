package test0124;

import java.util.Scanner;

public class ifTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 2개를 입력하세요.");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		if(score1>=70 && score2>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("end");
		sc.close();
	}

}
