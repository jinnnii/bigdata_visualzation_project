package com.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.di.ui.ExamConsole;

public class App02 {

	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/di/setting02.xml");
//		ExamConsole console = ctx.getBean("console", ExamConsole.class);
//		console.print();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class); 
		ExamConsole console = (ExamConsole) ctx.getBean("console1");
		console.print();
		System.out.println(console.getExam());
	}

}
