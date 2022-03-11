package com.kej.webboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.webboard.domain.ReplyVO;
import com.kej.webboard.mapper.ReplyMapper;
@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	ReplyMapper mapper;
	
	@Override
	public boolean register(ReplyVO vo) {
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

	@Override
	public boolean remove(int rno) {
		return mapper.delete(rno)==1;
	}

	@Override
	public List<ReplyVO> getList(int bno) {
		return mapper.getReplyList(bno);
	}

}
