package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


//다대일 단방향 매핑
//장바구니에 담은 상품
//장바구니에 넣은 상품<==n:1==>장바구니
//장바구니에 넣은 상품<==n:1==>판매 상품


@Entity
@Data
@Table(name="cart_item")
public class CartItem {
	@Id
	@GeneratedValue
	@Column(name="cart_item_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	private int count;
}
