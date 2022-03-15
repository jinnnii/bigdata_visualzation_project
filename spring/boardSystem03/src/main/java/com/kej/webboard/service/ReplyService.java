package com.kej.webboard.service;

import java.util.List;

import com.kej.webboard.domain.ReplyVO;

public interface ReplyService {
	public boolean register(ReplyVO vo);
	public ReplyVO read(int rno);
	public boolean modify(ReplyVO vo);
	public boolean remove(int rno);
	public List<ReplyVO> getList(int bno);
}
