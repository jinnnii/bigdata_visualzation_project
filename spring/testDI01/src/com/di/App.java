package com.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.entity.DIExam;
import com.di.entity.Exam;
import com.di.ui.ExamConsole;

public class App {

	public static void main(String[] args) {
		DIExam exam = new DIExam();
		//1. use nomal
		/*LineExamConsole console = new LineExamConsole();
//		GridExamConsole console = new GridExamConsole();
		console.setDIExam(exam);
		console.print();*/
		
		//2. interface
//		ExamConsole console = new LineExamConsole();
		/*ExamConsole console = new GridExamConsole();
		console.setExam(exam);
		console.print();*/
		
		//3. use spring
		//---> what is maven?
		// project build tool : 프로젝트 빌드 도구
		// 웹이나 앱 프로젝트를 만들어 실행할 수 있는 
		// 빌드도구(=관리도구)가 많이 필요한데, 그것을
		// maven 또는 gradle(android) 사용
		//configure-> Convert to Maven Project
		// add pom.xml <-- 사용할 라이브러리 작성 <-- Spring Context 설치
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/di/setting.xml");
		// 1. class path xml :지금 현재 프로젝트의 root 기준 경로로 위치를 지정
		// 2. file system xml : Window 경로로 위치 지정
		// 3. xml web : url 형태로 위치 지정
		// 4. annotation config : java Annotation으로 -> 추후 설명
		
		// 1. (type casting) use id
//		ExamConsole console = (ExamConsole) ctx.getBean("exam");
		// 2. use className.class
		ExamConsole console = ctx.getBean(ExamConsole.class);
		// 3. use both
//		ExamConsole console = ctx.getBean("console",ExamConsole.class);
//		console.setExam(exam);<-- already setting in setting.xml
		console.print();
		System.out.println(console.getExam());
		
//		DIExam exam2= new DIExam(1,2,3,4);
//		List<String> majors = new ArrayList<String>();
//		majors.add("computer");
//		majors.add("math");
//		exam2.setMajors(majors); ==> 해당 코드를 setting.xml 에서도 설정하는 방법 확인
		
		
//		List<Exam> exams = new ArrayList<Exam>();
//		exams.add(new DIExam(1,2,3,4));
//		exams.add(new DIExam(1,2,3,4));
//		
//		for(Exam ex:exams) {
//			System.out.println(ex);
//		}
		
//		List<Exam> exams = (List<Exam>) ctx.getBean("exams");
//		for(Exam ex:exams) {
//			System.out.println(ex);
//		}
		
		List<Exam> exams = (List<Exam>) ctx.getBean("exams",List.class);
		for(Exam ex:exams) {
			System.out.println(ex);
		}
	}

}
