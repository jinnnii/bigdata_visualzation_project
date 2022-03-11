package com.kej.webboard.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Aspect //advice객체임을 알려주는 어노테이션
@Log
@Component
public class LogAdvice {
	
	public void logBefore() {
		log.info("================================");
	}
}
