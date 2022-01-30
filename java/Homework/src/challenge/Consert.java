package challenge;

import java.util.Scanner;

public class Consert {
	Group[] group = new Group[3];
	
	Scanner sc = new Scanner(System.in);
	public Consert() {
		group[0] = new Group("S");
		group[1] = new Group("A");
		group[2] = new Group("B");
		
	}
	public void reserve() {
		System.out.println("------------------------------------------------------");
		System.out.println("좌석구분 S(1) A(2) B(3)");
		System.out.println("------------------------------------------------------");
		System.out.print("좌석타입 선택>>");
		int groupNum = sc.nextInt();
		if(groupNum>3 || groupNum<1) {
			System.out.println("잘못된 좌석 타입입니다.");
			reserve();
		}
		group[groupNum-1].reserve();
	}

	public void search() {
		for(Group g : group) {
			g.display();	
		}
	}

	public void cancel() {
		System.out.println("------------------------------------------------------");
		System.out.println("좌석구분 S(1) A(2) B(3)");
		System.out.println("------------------------------------------------------");
		System.out.print("좌석타입 선택>> ");
		int groupNum = sc.nextInt();
		if(groupNum<1 || groupNum>3) {
			System.out.println("잘못된 좌석타입입니다.");
			cancel();
		}
		group[groupNum-1].display();
		System.out.println("이름>> ");
		String name = sc.next();
		group[groupNum-1].cancel(name);
		
	}

	public void run() {
		int selectNum = 0;
		
		while (selectNum != 4) {
			System.out.println("------------------------------------------------------");
			System.out.println("예약(1) 조회(2) 취소(3) 끝내기(4)");
			System.out.println("------------------------------------------------------");
			System.out.print("메뉴 선택>> ");
			selectNum = sc.nextInt();
			switch (selectNum) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				System.out.println("끝내기");
				break;
			default:
				System.out.println("잘못된 선택입니다.");
				break;
			}
		}
	}

}
