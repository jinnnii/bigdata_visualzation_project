package com.kej.demo1.service;

import java.util.List;

import com.kej.demo1.domain.ReplyVO;

public interface ReplyService {
	public List<ReplyVO> getList(int bno);
	public boolean register(ReplyVO vo);
	public boolean delete(int rno);
	public ReplyVO read(int rno);
}
