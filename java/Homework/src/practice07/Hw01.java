package practice07;

import java.util.HashMap;
import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라이름과 인구를 입력하세요 (예 : Korea 5000");
		while(true) {
			System.out.print("나라 이름, 인구>>");
			String name = sc.next();
			if(name.equals("그만")) break;
			
			int people = sc.nextInt();

			nations.put(name, people);
			
		}
		while(true) {
			System.out.print("인구 검색>>");
			String name = sc.next();
			try {
				int people = nations.get(name);
				System.out.println(name+"인구는 "+people);
			}catch(Exception e) {
				System.out.println(name+"나라는 없습니다.");
			}
			if(name.equals("그만")) break;
		}
		System.out.println("end");
	}

}
