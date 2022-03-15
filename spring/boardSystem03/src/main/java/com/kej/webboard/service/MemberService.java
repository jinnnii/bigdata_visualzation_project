package com.kej.webboard.service;

import com.kej.webboard.domain.MemberVO;

public interface MemberService {
	public void join(MemberVO member);
	public int idCheck(String id);
	public MemberVO loginCheck(String id);

}
