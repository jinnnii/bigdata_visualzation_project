package com.kej.boardsystem01.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kej.boardsystem01.domain.BoardVO;
import com.kej.boardsystem01.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperTest {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		List<BoardVO> list = mapper.getList();
		for(BoardVO vo:list) {
			log.info(vo);
		}
	}
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목99--");
		vo.setContent("내용99--");
		vo.setWriter("작성자99--");
		mapper.insert(vo);
	}
}
