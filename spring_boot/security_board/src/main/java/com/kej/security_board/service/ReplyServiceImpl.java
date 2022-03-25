package com.kej.security_board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.security_board.model.Board;
import com.kej.security_board.model.Reply;
import com.kej.security_board.repository.BoardRepository;
import com.kej.security_board.repository.ReplyRepository;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	ReplyRepository replyRepository;

	@Autowired
	BoardRepository boardRepository;
	
	@Override
	public List<Reply> findByBoard(Long id) {
		Board board = boardRepository.findById(id).get();
		return replyRepository.findByBoard(board);
	}

	@Override
	public Reply findById(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {
		replyRepository.deleteById(id);

	}

	@Override
	public void register(Reply reply, Board board) {
		reply.setBoard(board);
		replyRepository.save(reply);
	}

	@Override
	public Long count() {
		return replyRepository.count();
	}

}
