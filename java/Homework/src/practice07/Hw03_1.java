package practice07;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		System.out.println("�л��̸�, �а�, �й�, ��������� �Է��ϼ���");
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			String name = sc.next();
			String dept = sc.next();
			int sno = sc.nextInt();
			double score =sc.nextDouble();
			students.add(new Student(name,dept,sno,score));
		}
		for (Student s : students) {
			System.out.println("�̸� : "+s.getName());
			System.out.println("�а� : "+s.getDept());
			System.out.println("�й� : "+s.getSno());
			System.out.println("������� : "+s.getScore());
			System.out.println("---------------------");
		}
		while(true) {
			System.out.print("�л��̸�>>");
			String name = sc.next();
			if(name.equals("�׸�")) break;
			for(Student s : students) {
				if(s.getName().equals(name)) {
					System.out.println(s);
					break;
				}
			}
		}
	}

}
