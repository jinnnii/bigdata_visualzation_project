package challenge;

import java.util.Scanner;

public class Group {
	Seat[] group = new Seat[10];
	String groupName;
	
	public Group(String groupName) {
		this.groupName = groupName;
	}

	public Seat[] getGroup() {
		return group;
	}


	public void setGroup(Seat[] group) {
		this.group = group;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void display() {
		System.out.print(this.groupName+">> ");
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				System.out.print(" ⬜⬜⬜ ");
			} else {
				System.out.print(" "+group[i].getName()+" ");
			}
		}
		System.out.println();
	}
	public void reserve() {
		
		this.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름>> ");
		String name = sc.next();
		System.out.print("좌석번호>> ");
		int number = sc.nextInt();
		
		if(number<1 || number>10 || group[number-1]!=null) {
			System.out.println("이미 찼거나 잘못된 좌석번호입니다.");
			this.reserve();
		}
		group[number-1] = new Seat(this.groupName,name, number);
	}
	
	public void cancel(String name) {
		for(int i=0; i<group.length; i++) {
			if(group[i]!=null && name.equals(group[i].getName())) {
				group[i] =null;
				return;
			}
		}
	}

}
