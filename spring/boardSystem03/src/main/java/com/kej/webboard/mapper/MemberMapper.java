package com.kej.webboard.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kej.webboard.domain.MemberVO;

@Mapper
public interface MemberMapper {
	public void join(MemberVO member);
	public int idCheck(String id);
	public MemberVO loginCheck(String id);
}
