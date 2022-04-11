package com.kej.demo.service;

import java.util.List;

import com.kej.demo.domain.JpaMember;

public interface MemberService {
	public List<JpaMember> list();
	public void insert(JpaMember member);
	public JpaMember read(Long id);
	public void update(JpaMember member);
	public void delete(Long id);

}
