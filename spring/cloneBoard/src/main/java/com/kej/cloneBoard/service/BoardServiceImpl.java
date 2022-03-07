package com.kej.cloneBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.cloneBoard.domain.BoardVO;
import com.kej.cloneBoard.mapping.BoardMapping;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardMapping mapper;

	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public BoardVO getBoard(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBoard(int bno) {
		// TODO Auto-generated method stub
		return false;
	}

}
