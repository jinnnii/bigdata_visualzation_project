package com.di.ui;

import com.di.entity.Member;

public class LineMemberConsole {
	private Member member;

	public LineMemberConsole() {
	}

	public LineMemberConsole(Member member) {
		super();
		this.member = member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void print() {
		System.out.printf("%s, %d, %s, %s\n", 
				member.getName(), 
				member.getAge(), 
				member.getGender(),
				member.getHobbys());
	}

}
