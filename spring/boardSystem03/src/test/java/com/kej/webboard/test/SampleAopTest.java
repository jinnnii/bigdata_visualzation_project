package com.kej.webboard.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kej.webboard.service.SampleService;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleAopTest {
	@Autowired
	private SampleService service;
	@Test
	public void testClass() throws Exception {
		log.info(service);
		log.info(service.getClass().getName());
//		log.info(service.doAdd("abc","22"));
		log.info(service.doAdd("11","22"));
		log.info(service.doSub(11,22));
		log.info(service.doMul(11,22));
	}
}
