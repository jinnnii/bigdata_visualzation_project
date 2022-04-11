package com.kej.demo1.service;

import java.util.List;

import com.kej.demo1.domain.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	public void register(BoardVO vo);
	public BoardVO read(int bno);
	public boolean update(BoardVO vo);
	public boolean delete(int bno);
}
