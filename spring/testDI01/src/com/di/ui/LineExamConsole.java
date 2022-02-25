package com.di.ui;

import com.di.entity.Exam;

public class LineExamConsole implements ExamConsole{
	private Exam exam;

	public LineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	
	public LineExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n",
				exam.total(), exam.avg());
	}


	@Override
	public Exam getExam() {
		return exam;
	}
}
