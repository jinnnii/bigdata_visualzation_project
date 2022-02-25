package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.entity.Student;
import com.di.ui.GridMemberConsole;

public class App {

	public static void main(String[] args) {
//		List<String> hobbys = new ArrayList<String>();
//		hobbys.add("수영");
//		hobbys.add("등산");
//		Member member = new Member("홍길동", 20,"남자",hobbys);
//		
//		LineMemberConsole lmc = new LineMemberConsole(member);
//		GridMemberConsole gmc = new GridMemberConsole(member);
//		
//		lmc.print();
//		gmc.print();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/di/bean_config.xml");
		GridMemberConsole gmc = (GridMemberConsole) ctx.getBean("console");
		gmc.print();

	}

}
