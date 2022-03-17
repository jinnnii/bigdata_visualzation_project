package com.kej.demo1.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kej.demo1.domain.MemberVO;

@Mapper
public interface MemberMapper {
	public void join(MemberVO member);
	public int idCheck(String id);
	public MemberVO loginCheck(String id);
}
