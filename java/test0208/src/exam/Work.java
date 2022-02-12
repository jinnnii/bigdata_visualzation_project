package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {
	Scanner sc = new Scanner(System.in);
	public void input(ArrayList<Employee> list) {
		System.out.println("사번, 이름, 직급, 부서, 급여 데이터 입력");
		int eno = sc.nextInt();
		String name =sc.next();
		String position = sc.next();
		String dept = sc.next();
		int sal = sc.nextInt();
		list.add(new Employee(eno, name, position, dept, sal));
	}
	public void search(ArrayList<Employee> list) {
		System.out.print("사번 입력 >>");
		int eno = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(eno==list.get(i).getEno()) {
				System.out.println(list.get(i));
				break;
			}
		}
		
	}
	public void show(ArrayList<Employee> list) {
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
