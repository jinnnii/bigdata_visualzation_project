package com.kej.demo1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kej.demo1.domain.ReplyVO;

@Mapper
public interface ReplyMapper {
	public List<ReplyVO> getList(int bno);
	public int delete(int rno);
	public int register(ReplyVO vo);
	public ReplyVO read(int rno);
}
