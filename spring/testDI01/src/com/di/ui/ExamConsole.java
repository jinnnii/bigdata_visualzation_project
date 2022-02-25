package com.di.ui;

import com.di.entity.Exam;

public interface ExamConsole {
	void setExam(Exam exam);
	void print();
	Exam getExam();
}
