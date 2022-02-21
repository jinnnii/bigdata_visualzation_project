package practice07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hw03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> students = new HashMap<String, Student>();
		System.out.println("�л��̸�, �а�, �й�, ��������� �Է��ϼ���");
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			String name = sc.next();
			String dept = sc.next();
			int sno = sc.nextInt();
			double score =sc.nextDouble();
			students.put(name, new Student(name,dept,sno,score));
		}
		for (Map.Entry<String, Student> s : students.entrySet()) {
			System.out.println("�̸� : "+s.getValue().getName());
			System.out.println("�а� : "+s.getValue().getDept());
			System.out.println("�й� : "+s.getValue().getSno());
			System.out.println("������� : "+s.getValue().getScore());
			System.out.println("---------------------");
		}
		while(true) {
			System.out.print("�л��̸�>>");
			String name = sc.next();
			if(name.equals("�׸�")) break;
			System.out.println(students.get(name));
		}

	}

}
