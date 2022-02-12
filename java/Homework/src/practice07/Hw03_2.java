package practice07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hw03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> students = new HashMap<String, Student>();
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요");
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			String name = sc.next();
			String dept = sc.next();
			int sno = sc.nextInt();
			double score =sc.nextDouble();
			students.put(name, new Student(name,dept,sno,score));
		}
		for (Map.Entry<String, Student> s : students.entrySet()) {
			System.out.println("이름 : "+s.getValue().getName());
			System.out.println("학과 : "+s.getValue().getDept());
			System.out.println("학번 : "+s.getValue().getSno());
			System.out.println("학점평균 : "+s.getValue().getScore());
			System.out.println("---------------------");
		}
		while(true) {
			System.out.print("학생이름>>");
			String name = sc.next();
			if(name.equals("그만")) break;
			System.out.println(students.get(name));
		}

	}

}
