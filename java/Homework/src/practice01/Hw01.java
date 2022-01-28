package practice01;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mUnit = new int[]{50000,10000,5000,1000,500,100,50,10,5,1};
		int[] pUnit = new int[10];
		System.out.println("지불할 금액을 입력하세요");
		int price = sc.nextInt();

		for(int i=0; i<mUnit.length; i++) {
			pUnit[i] = price/mUnit[i];
			price = price%mUnit[i];
			
			System.out.printf("%d원권 %d매",mUnit[i],pUnit[i]);
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
