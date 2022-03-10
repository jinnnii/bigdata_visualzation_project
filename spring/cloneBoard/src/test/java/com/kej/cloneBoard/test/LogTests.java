package com.kej.cloneBoard.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kej.cloneBoard.domain.BoardVO;
import com.kej.cloneBoard.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class LogTests {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		List<BoardVO> list = mapper.getList();
		for(BoardVO vo:list) {
			log.info(vo);
		}
	}
	
}
