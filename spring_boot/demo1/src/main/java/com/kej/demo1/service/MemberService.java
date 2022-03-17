package com.kej.demo1.service;

import com.kej.demo1.domain.MemberVO;

public interface MemberService {
	public void join(MemberVO vo);
	public boolean idCheck(String id);
	public MemberVO loginCheck(String id);
}
