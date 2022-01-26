package test0124;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
		int score = sc.nextInt();
		
		String result =(score>70)?"합격":"불합격";
		System.out.println(result);
		
		System.out.println("---------------------");
		
		if(score>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("end");
		
		sc.close();
	}

}
