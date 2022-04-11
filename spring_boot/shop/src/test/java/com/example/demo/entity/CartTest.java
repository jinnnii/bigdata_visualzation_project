package com.example.demo.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.demo.repository.CartRepository;
import com.example.demo.repository.MemberRepository;
import com.example.demo.vo.MemberVO;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application.properties")
public class CartTest {
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	
	@PersistenceContext
	EntityManager em;
	
	public Member createMember() {
		MemberVO member=new MemberVO();
		member.setName("홍길동");
		member.setEmail("hong@naver.com");
		member.setAddress("busan");
		member.setPassword("1234");
		
		return Member.createMember(member);
	}
	
	//1:1 매핑은 두개 같이 넣어야 데이터가 입력, 
	@Test
	@DisplayName("장바구니 회원 엔티티 매핑 조회 테스트")
	public void findCartandMemberTest() {
		Member member = createMember();
		memberRepository.save(member);
		
		Cart cart = new Cart();
		cart.setMember(member);
		cartRepository.save(cart);
		
		em.flush();
		em.clear();
		
		Cart saveCart = cartRepository.findById(cart.getId())
				.orElseThrow(EntityNotFoundException::new);
//		assertEquals(saveCart.getMember().getId(), member.getId());
		
		System.out.println(saveCart);
	}
	

}
