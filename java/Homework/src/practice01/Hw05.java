package practice01;

import java.util.Scanner;

public class Hw05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("양의 정수 10개를 입력하세요.");
		for(int i=0; i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("출력 결과 : 3의 배수는");
		for(int i : array) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();

	}

}
