package com.kej.webmvc.service;

import java.util.List;

import com.kej.webmvc.entity.Board;

public interface BoardService {
	List<Board> getList();
	Board getBoard();

}
