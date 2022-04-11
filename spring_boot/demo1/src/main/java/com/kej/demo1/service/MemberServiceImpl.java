package com.kej.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.demo1.domain.MemberVO;
import com.kej.demo1.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper mapper;
	
	@Override
	public void join(MemberVO member) {
		mapper.join(member);
	}

	@Override
	public boolean idCheck(String id) {
		return mapper.idCheck(id)>0;
	}

	@Override
	public MemberVO loginCheck(String id) {
		return mapper.loginCheck(id);
	}

}
