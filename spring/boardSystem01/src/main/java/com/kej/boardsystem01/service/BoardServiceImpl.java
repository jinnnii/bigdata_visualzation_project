package com.kej.boardsystem01.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.boardsystem01.domain.BoardVO;
import com.kej.boardsystem01.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public BoardVO read(int bno) {
		boardMapper.hitcount(bno);
		return boardMapper.read(bno);
	}

	@Override
	public void Insert(BoardVO board) {
		boardMapper.insert(board);
		
	}

	@Override
	public boolean update(BoardVO vo) {
		return boardMapper.update(vo)==1;
		
	}

	@Override
	public boolean delete(int bno) {
		boardMapper.delete(bno);
		return boardMapper.delete(bno)==1;
	}

//	@Override
//	public int boardCount() {
//		return boardMapper.boardCount();
//	}

	@Override
	public List<BoardVO> findPage(HashMap<String,Object> hm) {
		return boardMapper.findPage(hm);
	}

	@Override
	public List<BoardVO> findAll(HashMap<String, Object> hm) {
		return boardMapper.findAll(hm);
	}

	@Override
	public int boardCount(HashMap<String, Object> hm) {
		return boardMapper.boardCount(hm);
	}

	
}
