package com.kej.bitc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.bitc.dto.BoardDto;
import com.kej.bitc.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}

	@Override
	public BoardDto selectBoard(int boardId) {
		return boardMapper.selectBoard(boardId);
	}

	@Override
	public void insertBoard(String title, String content, String createId, String updateId) {
		boardMapper.insertBoard(title, content, createId, updateId);
	}

	@Override
	public void updateBoard(String title, String content, int boardId) {
		boardMapper.updateBoard(title, content, boardId);
		
	}

	@Override
	public void deleteBoard(int boardId) {
		boardMapper.deleteBoard(boardId);
	}

}
