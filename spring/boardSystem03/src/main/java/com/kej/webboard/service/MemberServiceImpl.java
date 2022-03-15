package com.kej.webboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.webboard.domain.MemberVO;
import com.kej.webboard.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void join(MemberVO member) {
		mapper.join(member);
	}

	@Override
	public int idCheck(String id) {
		return mapper.idCheck(id);
	}

	@Override
	public MemberVO loginCheck(String id) {
		return mapper.loginCheck(id);
	}
	
}
