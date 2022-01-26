package test0124;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		char ch1='a';
		char ch2 = 'A';
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);//32
		Scanner sc = new Scanner(System.in);
		String str="";
		
		while(!str.equals("q")) {
			System.out.println("문자열 입력");
			str= sc.next();
			
			char ch = str.charAt(0);
			if(ch>='a'&&ch<='z') { 
				System.out.println((char)(ch-32));
			}else {
				System.out.println(ch);
			}
		}
		
		sc.close();

	}

}
