package com.kej.board.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kej.board.model.Board;
import com.kej.board.model.Reply;
import com.kej.board.model.User;

public interface BoardService {
//	public List<Board> getList();
	public Page<Board> findAll(Pageable pageable);
	public Board findById(Long bno);
	public void register(Board board, User user);
	public void update(Board board);
	public void delete(Long bno);
	public Long count();
	
	public List<Reply> replies(Long bno);
	public void insertReply(Reply reply);
	public void deleteReply(Long rno);
	
}
