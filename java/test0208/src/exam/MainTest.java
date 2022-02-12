package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Employee> aList = new ArrayList<Employee>();
		Work work = new Work();
		Scanner sc= new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.print("1 입력 | 2 검색 | 3 전체보기 | 4 종료 >>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				work.input(aList);
				break;
			case 2:
				work.search(aList);
				break;
			case 3:
				work.show(aList);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag= false; break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
			
			
			
		}
	}

}
