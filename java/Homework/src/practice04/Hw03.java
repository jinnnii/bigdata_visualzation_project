package practice04;

import java.util.Scanner;

public class Hw03 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
//		students[0] = new Student(1, "홍길동", "영문", 80, 70, 80);
//		students[1] = new Student(2, "박경미", "컴공", 70, 80, 75);
//		students[2] = new Student(3, "하성호", "전컴", 80, 85, 90);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students
				.length; i++) {
			System.out.println("학번을 입력하세요");
			int sno = sc.nextInt();

			System.out.println("이름을 입력하세요");
			String name = sc.next();

			System.out.println("학과를 입력하세요");
			String dept = sc.next();

			System.out.println("3개의 성적을 입력해주세요");
			int score[] = new int[3];
			score[0] = sc.nextInt();
			score[1] = sc.nextInt();
			score[2] = sc.nextInt();

			students[i] = new Student(sno, name, dept, score);
		}
		
		
		System.out.println("학번\t이름\t학과\t성적1\t성적2\t성적3\t총점\t평균\t등수");
		for (Student s : students) {
			s.rankPro(students);
			s.display();
		}
		sc.close();
	}
}
