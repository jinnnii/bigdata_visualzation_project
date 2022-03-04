package com.kej.boardsystem01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.kej.boardsystem01.domain.BoardVO;

@Mapper
public interface BoardMapper {
	@Select("select * from tbl_board where bno>0")
	public List<BoardVO> getList();
	
	public void insertBoard(BoardVO vo);
	
	public BoardVO getBoard(int bno);
	
	public void updateBoard(BoardVO vo);
	
	public void deleteBoard(int bno);
}
