package com.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.di.entity.DIExam;
import com.di.entity.Exam;
import com.di.ui.ExamConsole;
import com.di.ui.GridExamConsole;
import com.di.ui.LineExamConsole;

@ComponentScan({"com.di.ui","com.di.entity"})
//@ComponentScan("com.di")
//==<context:component-scan base-package="com.di"/>
@Configuration
public class AppConfig {
	
	@Bean
	public Exam exam1() {//id='exam'
		List<String> majors= new ArrayList<String>();
		majors.add("web");
		majors.add("app");
		DIExam exam = new DIExam(90,80,70,60);
		exam.setMajors(majors);
		return exam;
		
	}
	@Bean
	public Exam exam2() {//id='exam2'
		return new DIExam(50,40,30,20);
	}
	
	@Bean
	public ExamConsole console1() {
		return new GridExamConsole(); 
	}
	
	@Bean
	public ExamConsole console2() {
		return new LineExamConsole(); 
	}
}
