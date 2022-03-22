package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//장바구니 <==1:1==>멤버
//사용자별 하나의 장바구니를 가지고 있음, 사용자 생성시 장바구니도 생성

@Entity
@Table(name="cart")
@Getter @Setter
@ToString
public class Cart {
	@Id
	@Column(name="cart_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="member_id")
	private Member member;
	
//	@OneToMany(mappedBy = "cart_item")
//	private List<CartItem> cartItems;

}
