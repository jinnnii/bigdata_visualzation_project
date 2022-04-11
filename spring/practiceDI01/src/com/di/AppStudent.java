package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.entity.Student;

public class AppStudent {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/di/bean_config.xml");
		Student student = ctx.getBean(Student.class);
		System.out.println(student);
	}

}
