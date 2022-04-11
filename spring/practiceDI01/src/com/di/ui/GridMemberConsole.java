package com.di.ui;

import com.di.entity.Member;

public class GridMemberConsole {
	private Member member;
	public GridMemberConsole() {
		// TODO Auto-generated constructor stub
	}
	public GridMemberConsole(Member member) {
		super();
		this.member = member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public void print() {
		System.out.println("+++++++++++++++++++++++");
		System.out.printf("이름 : %s\n",member.getName());
		System.out.printf("나이 : %d\n",member.getAge());
		System.out.printf("성별 : %s\n",member.getGender());
		System.out.printf("취미 : %s\n",member.getHobbys());
		System.out.println("+++++++++++++++++++++++");
	}
}
