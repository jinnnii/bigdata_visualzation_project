package com.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.di.entity.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {
	@Autowired(required = false)
	@Qualifier("exam1")
	private Exam exam;

	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	public GridExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}

//	@Autowired
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		if (exam == null) {
			System.out.println("객체 생성 되지 않음");
		} else {
			System.out.println("┌──────────┬──────────┐");
			System.out.println("│ total    │ avg      │");
			System.out.println("├──────────┼──────────┤");
			System.out.printf("│ %3d      │ %3.2f    │\n", exam.total(), exam.avg());
			System.out.println("└──────────┴──────────┘");
		}
	}

	@Override
	public Exam getExam() {
		return exam;
	}
}
