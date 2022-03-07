package com.kej.boardsystem01.service;

import java.util.List;

import com.kej.boardsystem01.domain.BoardVO;

public interface BoardService {
	List<BoardVO> getList();

	BoardVO read(int bno);

	void Insert(BoardVO board);

	boolean update(BoardVO vo);

	boolean delete(int bno);
	
	int boardCount();
}

