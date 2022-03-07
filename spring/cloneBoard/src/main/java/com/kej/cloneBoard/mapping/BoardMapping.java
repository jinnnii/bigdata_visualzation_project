package com.kej.cloneBoard.mapping;

import java.util.List;

import com.kej.cloneBoard.domain.BoardVO;

public interface BoardMapping {
	List<BoardVO> getList();
	BoardVO getBoard(int bno);
	void insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(int bno);
}
