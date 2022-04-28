package com.kej.bitc.service;

import java.util.List;

import com.kej.bitc.dto.BoardDto;


public interface BoardService {

	List<BoardDto> selectBoardList() throws Exception;
	BoardDto selectBoard(int boardId);
	void insertBoard(String title, String content, String createId, String updateId);
	void updateBoard(String title, String content, int boardId);
	void deleteBoard(int boardId);
}
