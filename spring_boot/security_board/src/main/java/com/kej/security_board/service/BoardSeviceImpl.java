package com.kej.security_board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kej.security_board.model.Board;
import com.kej.security_board.model.Reply;
import com.kej.security_board.model.User;
import com.kej.security_board.repository.BoardRepository;
import com.kej.security_board.repository.ReplyRepository;

@Service
public class BoardSeviceImpl implements BoardService {
	@Autowired
	BoardRepository boardRepository;

	@Autowired
	ReplyRepository replyRepository;

//	@Override
//	public List<Board> getList() {
//		return boardRepository.findAll();
//	}

	
	@Override
	public Page<Board> findAll(Pageable pageable) {
		return boardRepository.findAll(pageable);
	}
	
	
	
	@Override
	public Board findById(Long bno) {
		Board board = boardRepository.findById(bno).get();
		board.setHitcount(board.getHitcount() + 1);
		boardRepository.save(board);
		return board;
	}

	@Override
	public void register(Board board, User user) {
		board.setUser(user);
		boardRepository.save(board);

	}

	@Override
	public void update(Board board) {
		// return boardRepository.save(board); ==> 더티 체킹
		// ... 일부만 바꾸어도 되는 데이터를 전부 바꾸는 것
		Board b = boardRepository.findById(board.getId()).get();
		b.setTitle(board.getTitle());
		b.setContent(board.getContent());
		boardRepository.save(b);
	}

	@Override
	public void delete(Long bno) {
		boardRepository.deleteById(bno);

	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return boardRepository.count();
	}

	// ---------------------------댓글------------------------------//

	@Override
	public List<Reply> replies(Long bno) {
		return replyRepository.findByBno(bno);
	}

	@Override
	public void insertReply(Reply reply) {
		replyRepository.save(reply);
//		replyRepository.replyInsert(//
//				reply.getWriter(), //
//				reply.getContent(), //
//				reply.getBoard().getId(), //
//				reply.getUser().getId());//
	}

	@Override
	public void deleteReply(Long rno) {
		replyRepository.deleteById(rno);

	}

}
