package com.kej.webboard.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Aspect //advice객체임을 알려주는 어노테이션
@Log
@Component
public class LogAdvice {
	//해당 패키지 않에 SampleService로 시작하는 모든 클래스의 모든 함수
//	@Before("execution(* com.kej.webboard.service.SampleService*.*(..))")
	public void logBefore() {
		log.info("================================");
	}
	
//	@Before("execution(* com.kej.webboard.service.SampleService*.doAdd(String,String))&& args(str1,str2)")
		public void logBeforeWidthParam(String str1, String str2) {
			log.info("str1 : "+str1);
			log.info("str2 : "+str2);
		}
	
//	@AfterThrowing(pointcut="execution(* com.kej.webboard.service.SampleService*.*(..))",throwing="exception")
	public void logException(Exception exception) {
		log.info("Exception!!!!!!");
		log.info("exception : "+exception);
	}
	
	@Around("execution(* com.kej.webboard.service.SampleService*.*(..))")
	public Object logTime(ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		log.info("Target : "+pjp.getTarget());
		log.info("Param : "+Arrays.toString(pjp.getArgs()));
		
		Object result = null;
		try {
			result=pjp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		log.info("Time : "+(end-start));
		return result;
	}
}
