package test0121;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("name:");
		String name = sc.next(); //입력한 값을 문자열로 변환하여 반환
		System.out.print("age:");
		int age = sc.nextInt(); // 입력한 값을 정수로 반환
		System.out.print("weight:");
		double weight = sc.nextDouble();//입력한 값을 실수로 반환
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("weight:"+weight);
	}

}
