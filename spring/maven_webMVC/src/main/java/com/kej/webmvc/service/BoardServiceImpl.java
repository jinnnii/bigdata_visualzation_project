package com.kej.webmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kej.webmvc.entity.Board;
@Service
public class BoardServiceImpl implements BoardService{

	@Override
	public List<Board> getList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board(1,"title1","user00","content1"));
		list.add(new Board(2,"title2","user01","content2"));
		list.add(new Board(3,"title3","user02","content3"));
		list.add(new Board(4,"title4","user03","content4"));
		list.add(new Board(5,"title5","user04","content5"));
		return list;
	}

	@Override
	public Board getBoard() {
		// TODO Auto-generated method stub
		return null;
	}

}
