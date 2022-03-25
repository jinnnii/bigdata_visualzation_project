package com.kej.security_board.service;

import java.util.List;

import com.kej.security_board.model.Board;
import com.kej.security_board.model.Reply;

public interface ReplyService {
	public List<Reply> findByBoard(Long id);
	public Reply findById(Long id);
	public void delete(Long id);
	public void register(Reply reply, Board board);
	public Long count();
}
