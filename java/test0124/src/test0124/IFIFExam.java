package test0124;

public class IFIFExam {

	public static void main(String[] args) {
		int age = 28;
		if (age < 8 || age > 26) {
			System.out.println("학생이 아닙니다.");
		} else {
			if (age < 14) {
				System.out.println("초등학생");
			} else if (age < 17) {
				System.out.println("중학생");
			} else if (age < 20) {
				System.out.println("고등학생");
			} else {
				System.out.println("대학생");
			}
		}

	}

}
