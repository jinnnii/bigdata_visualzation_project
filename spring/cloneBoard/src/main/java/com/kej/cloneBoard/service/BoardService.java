package com.kej.cloneBoard.service;

import java.util.List;

import com.kej.cloneBoard.domain.BoardVO;

public interface BoardService {
	List<BoardVO> getList();
	BoardVO getBoard(int bno);
	void insertBoard(BoardVO vo);
	boolean updateBoard(BoardVO vo);
	boolean deleteBoard(int bno);
}
