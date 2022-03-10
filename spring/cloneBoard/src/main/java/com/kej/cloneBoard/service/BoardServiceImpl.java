package com.kej.cloneBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.cloneBoard.domain.BoardVO;
import com.kej.cloneBoard.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public BoardVO getBoard(int bno) {
		return boardMapper.getBoard(bno);
	}

	@Override
	public void insertBoard(BoardVO vo) {
		boardMapper.insertBoard(vo);

	}

	@Override
	public boolean updateBoard(BoardVO vo) {
		
		return boardMapper.updateBoard(vo)==1;
	}

	@Override
	public boolean deleteBoard(int bno) {
		return boardMapper.deleteBoard(bno)==1;
	}

}
