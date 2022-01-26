package test0121;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		System.out.println("문자 3개 입력");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(addr);
		
		sc.close();

	}

}
