package com.kej.webboard.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kej.webboard.domain.BoardVO;


@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	
	public void insert(BoardVO vo);

	public BoardVO read(int bno);
	
	public int update(BoardVO vo);
	
	public int delete(int bno);

	public int hitcount(int bno);
	
	public List<BoardVO> findPage(HashMap<String,Object> hm);

	public int boardCount(HashMap<String, Object> hm);

	public List<BoardVO> findAll(HashMap<String, Object> hm);
}
