package com.kej.webboard.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kej.webboard.service.SampleService;

import lombok.extern.log4j.Log4j2;



@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleAOPTest {
	@Autowired
	private SampleService service;
	
	@Test
	public void testClass() {
		
	}
}
