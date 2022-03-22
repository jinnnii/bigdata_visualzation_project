package com.kej.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kej.demo.domain.Member;

public interface MemberRepository02 extends JpaRepository<Member,Long>{
	public List<Member> findByName(String name);
	public List<Member> findByEmail(String email);
	public List<Member> findByNameAndEmail(String name, String email);
	public List<Member> findByNameLike(String name);
	public List<Member> findByNameIn(String...names);
	public List<Member> findAllByOrderByIdDesc();
	public List<Member> findByNameOrderByIdDesc(String name);
	public List<Member> findByNameLikeOrderByIdDesc(String name);
}
