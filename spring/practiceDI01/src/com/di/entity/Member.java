package com.di.entity;

import java.util.List;

public class Member {
	private String name;
	private int age;
	private String gender;
	private List<String> hobbys;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age, String gender, List<String> hobbys) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hobbys = hobbys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", hobbys=" + hobbys + "]";
	}
	
	
}
