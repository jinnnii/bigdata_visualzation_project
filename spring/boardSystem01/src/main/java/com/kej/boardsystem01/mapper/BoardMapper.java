package com.kej.boardsystem01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.kej.boardsystem01.domain.BoardVO;

@Mapper
public interface BoardMapper {
//	@Select("select * from tbl_board where bno>0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO vo);
	//public void insert(BoardVO, int bno) //error!! 파라미터는 한개만
	
	//public void insertSelectKey(BoardVO vo);
	
	public BoardVO read(int bno);
	
	public int update(BoardVO vo);
	
	public int delete(int bno);
	
	public int boardCount();
}
