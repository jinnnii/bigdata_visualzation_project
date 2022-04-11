package com.kej.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.demo1.domain.ReplyVO;
import com.kej.demo1.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	ReplyMapper mapper;

	@Override
	public List<ReplyVO> getList(int bno) {
		return mapper.getList(bno);
	}

	@Override
	public boolean register(ReplyVO vo) {
		return mapper.register(vo)==1;
	}

	@Override
	public boolean delete(int rno) {
		return mapper.delete(rno)==1;
	}

	@Override
	public ReplyVO read(int rno) {
		return mapper.read(rno);
	}

}
