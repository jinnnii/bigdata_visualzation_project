package practice07;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요");
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			String name = sc.next();
			String dept = sc.next();
			int sno = sc.nextInt();
			double score =sc.nextDouble();
			students.add(new Student(name,dept,sno,score));
		}
		for (Student s : students) {
			System.out.println("이름 : "+s.getName());
			System.out.println("학과 : "+s.getDept());
			System.out.println("학번 : "+s.getSno());
			System.out.println("학점평균 : "+s.getScore());
			System.out.println("---------------------");
		}
		while(true) {
			System.out.print("학생이름>>");
			String name = sc.next();
			if(name.equals("그만")) break;
			for(Student s : students) {
				if(s.getName().equals(name)) {
					System.out.println(s);
					break;
				}
			}
		}
	}

}
