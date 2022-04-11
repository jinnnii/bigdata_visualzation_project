package com.kej.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.demo.domain.JpaMember;
import com.kej.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public List<JpaMember> list(){
		return memberRepository.findAll();
	}

	@Override
	public void insert(JpaMember member) {
		memberRepository.save(member);
		
	}

	@Override
	public JpaMember read(Long id) {
		return memberRepository.findById(id).get();
//		return memberRepository.getById(id);
	}

	@Override
	public void update(JpaMember member) {
		JpaMember m = memberRepository.findById(member.getId()).get();
//		memberRepository.save(member);
		m.setEmail(member.getEmail());
		m.setMemo(member.getMemo());
		
	}

	@Override
	public void delete(Long id) {
		memberRepository.deleteById(id);
		
	}
}
