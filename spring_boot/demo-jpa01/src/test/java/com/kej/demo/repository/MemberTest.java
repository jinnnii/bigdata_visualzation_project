package com.kej.demo.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;

import com.kej.demo.domain.Member;
import com.kej.demo.domain.Role;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class MemberTest {
	@Autowired
	MemberRepository02 memberRepository;

	@Test
	public void createMemberTest() {
		Member member = new Member();
		member.setName("홍");
		member.setEmail("aaa@naver.com");
		member.setPassword("1234");
		member.setAddress("busan");
		member.setRole(Role.ADMIN);
		memberRepository.save(member);
	}

	@Test
	public void createMemberListTest() {
		for (int i = 0; i < 5; i++) {
			Member member = new Member();
			member.setName("홍길동"+i);
			member.setEmail("aaa"+i+"@naver.com");
			member.setPassword("1234");
			member.setAddress("busan"+i);
			member.setRole(Role.USER);
			memberRepository.save(member);
		}
	}
	
	@Test
	public void getMemebrList() {
		List<Member> members = memberRepository.findAll();
		for(Member m : members) {
			System.out.println(m);
		}
	}
	
	@Test
	public void getMember1() {
		Member member1 = memberRepository.findById(1L).get();
		System.out.println(member1);
	}
	
//	@Test
//	public void getMember2() {
//		Member member2 = memberRepository.getById(2L);
//		System.out.println(member2);
//	}
	
	@Test
	public void updateMemberTest() {
		Member member = new Member();
		member.setId(1L);
		member.setName("홍길치");
		member.setEmail("aaa@naver.com");
		member.setPassword("1234");
		member.setAddress("busan saha");
		member.setRole(Role.ADMIN);
		memberRepository.save(member);
	}
	
	@Test
	public void deleteMemberTest() {
		//method 1
		Member member = new Member();
		member.setId(5L);
		memberRepository.delete(member);
		
		// method 2
		memberRepository.deleteById(6L);
	}
	
	@Test
	public void name_email() {
		List<Member> members = memberRepository.findByName("홍길치");
		List<Member> emails = memberRepository.findByEmail("aaa@naver.com");
		for(Member member : members) {
			System.out.println(member);
		}
		
		for(Member email:emails) {
			System.out.println(email);
		}
	}
	@Test
	public void nameAndEmail() {
		List<Member> members = memberRepository.findByNameAndEmail("홍길치","aaa@naver.com");
		for(Member member : members) {
			System.out.println(member);
		}
	}
	
	@Test
	public void nameLike() {
		List<Member> members = memberRepository.findByNameLike("%홍길동%");
		for(Member member: members) {
			System.out.println(member);
		}
	}
	
	@Test
	public void nameIn() {
		List<Member> members = memberRepository.findByNameIn("홍길동","홍길동1","홍길치");
		for(Member member:members) {
			System.out.println(member);
		}
	}
	
	@Test
	public void orderbyId() {
		List<Member> members = memberRepository.findAllByOrderByIdDesc();
		for(Member member:members) {
			System.out.println(member);
		}
	}
	
	@Test
	public void sort() {
		List<Member> members = memberRepository.findAll(Sort.by(Sort.Direction.DESC,"id"));
		for(Member member:members) {
			System.out.println(member);
		}
	}
	
	@Test
	public void nameOrderById() {
		List<Member> members = memberRepository.findByNameOrderByIdDesc("홍길치");
		for(Member member:members) {
			System.out.println(member);
		}
	}
	
	@Test
	public void nameLikeOrderById() {
		List<Member> members = memberRepository.findByNameLikeOrderByIdDesc("%홍길동%");
		for(Member member:members) {
			System.out.println(member);
		}
	}
	
	@Test
	public void pageTest() {
		Pageable pageable = PageRequest.of(0, 5);
		Page<Member> memberPage = memberRepository.findAll(pageable);
		List<Member> members = memberPage.getContent();
		
		for(Member member:members) {
			System.out.println(member);
		}
	}
	
}
