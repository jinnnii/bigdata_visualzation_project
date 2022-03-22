package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.constant.OrderStatus;

import lombok.Data;


// 멤버 <==n:1==> 주문    : 멤버당 여러개의 주문을 할 수 있음
// 주문 <==1:n==> 주문상품 : 주문 한개에 여러개의 주문 상품이 있음

// 멤버 <==n:1==> 주문 <==1:n==> 주문상품 : 양방향 매핑

// 멤버 <==1:n==> 멤버 상품 <==n:1==> 상품 : 다대다 매핑


@Entity
@Table(name="orders")
@Data
public class Order {
	@Id
	@GeneratedValue
	@Column(name="order_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	private LocalDateTime orderDate;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
//	@OneToMany(mappedBy = "order_item")
//	private List<OrderItem> orderItems;
}
