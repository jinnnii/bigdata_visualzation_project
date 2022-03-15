package com.kej.webboard.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public Integer doAdd(String str1, String str2) throws Exception {
		return Integer.parseInt(str1)+ Integer.parseInt(str2);
	}

	@Override
	public int doSub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int doMul(int num1, int num2) {
		return num1*num2;
	}
}
