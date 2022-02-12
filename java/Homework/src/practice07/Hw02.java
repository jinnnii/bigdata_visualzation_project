package practice07;

import java.util.Scanner;
import java.util.Vector;

public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> rains = new Vector<Integer>();
		int sum=0;
		
		while(true) {
			int rain;	
			System.out.print("강수량 입력(0 입력시 종료)>>");
			rain = sc.nextInt();
			if(rain==0)break;
			rains.add(rain);
			sum+=rain;
			System.out.println("현재 평균: "+sum/rains.size());
		}
		System.out.println("End");
	}

}
