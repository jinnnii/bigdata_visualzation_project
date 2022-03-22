package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.constant.Role;
import com.example.demo.vo.MemberVO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="member")
@Getter @Setter @ToString
public class Member {
	@Id
	@Column(name = "member_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Column(unique=true)
	private String email;
	
	private String password;
	private String address;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
//	@OneToMany(mappedBy = "orders")
//	private List<Order> orders = new ArrayList<Order>();
	
	public static Member createMember (MemberVO vo) {
		Member member = new Member();
		member.setName(vo.getName());
		member.setEmail(vo.getEmail());
		member.setAddress(vo.getAddress());
		member.setPassword(vo.getPassword());
		member.setRole(Role.ADMIN);
		return member;
	}
}
