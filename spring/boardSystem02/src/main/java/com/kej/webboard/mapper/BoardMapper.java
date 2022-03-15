package com.kej.webboard.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
	//값이 많을 때는 해쉬맵에 묶어서, 작으면 RequestParam으로!
	public List<BoardVO> findAll(HashMap<String, Object> hm);
	
	//한 객체에 담아서 보내줌, 원래 매퍼는 파라미터는 하나만 넣을 수있음
	public void replyCountUpdate(@Param("bno")int bno,
			@Param("amount") int amount);

}
