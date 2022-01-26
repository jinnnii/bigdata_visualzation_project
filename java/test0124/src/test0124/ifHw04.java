package test0124;

import java.util.Scanner;

public class ifHw04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 2개를 입력하세요.");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		if(score1>=70 && score2>=70) {
			System.out.println("합격");
			int avg = (score1+score2)/2;
			System.out.print("평균:"+avg+" ");
			if(avg>=90) {
				System.out.println("A학점");
			}else if(avg>=80) {
				System.out.println("B학점");
			}else if(avg>=70) {
				System.out.println("C학점");
			}
		}else {
			System.out.println("불합격");
		}
		sc.close();
	}

}
