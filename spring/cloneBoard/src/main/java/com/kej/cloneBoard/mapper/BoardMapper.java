package com.kej.cloneBoard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kej.cloneBoard.domain.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	public BoardVO getBoard(int bno);
	public void insertBoard(BoardVO vo);
	public int updateBoard(BoardVO vo);
	public int deleteBoard(int bno);
}
