package practice07;

import java.util.HashMap;
import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("�����̸��� �α��� �Է��ϼ��� (�� : Korea 5000");
		while(true) {
			System.out.print("���� �̸�, �α�>>");
			String name = sc.next();
			if(name.equals("�׸�")) break;
			
			int people = sc.nextInt();

			nations.put(name, people);
			
		}
		while(true) {
			System.out.print("�α� �˻�>>");
			String name = sc.next();
			try {
				int people = nations.get(name);
				System.out.println(name+"�α��� "+people);
			}catch(Exception e) {
				System.out.println(name+"����� �����ϴ�.");
			}
			if(name.equals("�׸�")) break;
		}
		System.out.println("end");
	}

}
