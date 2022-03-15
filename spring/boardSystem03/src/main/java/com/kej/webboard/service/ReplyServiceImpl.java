package com.kej.webboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kej.webboard.domain.ReplyVO;
import com.kej.webboard.mapper.BoardMapper;
import com.kej.webboard.mapper.ReplyMapper;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService{

//	@Autowired
	ReplyMapper mapper;
	private BoardMapper boardMapper;
	
	@Transactional
	@Override
	public boolean register(ReplyVO vo) {
		boardMapper.replyCountUpdate(vo.getBno(), 1);
		return mapper.insert(vo)==1;
	}

	@Override
	public ReplyVO read(int rno) {
		return mapper.read(rno);
	}

	@Override
	public boolean modify(ReplyVO vo) {
		return mapper.update(vo)==1;
	}

	@Transactional
	@Override
	public boolean remove(int rno) {
		ReplyVO vo = mapper.read(rno);
		boardMapper.replyCountUpdate(vo.getBno(), -1);
		return mapper.delete(rno)==1;
	}

	@Override
	public List<ReplyVO> getList(int bno) {
		return mapper.getReplyList(bno);
	}

}
