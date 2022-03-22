package com.kej.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder;
import com.kej.demo.constant.ItemSellStatus;
import com.kej.demo.domain.Item;
import com.kej.demo.domain.QItem;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class ItemTest {
	// 데이터 저장, list조회, entity 1개 조회, 수정, 삭제, 작성하기

	@Autowired
	ItemRepository itemRepository;
	
	@PersistenceContext
	EntityManager em;

	@Test
	public void insertItem() {
		Item item = new Item();
		item.setItemName("상품");
		item.setItemDetail("상세 설명");
		item.setItemSellStatus(ItemSellStatus.SELL);
		item.setPrice(5000);
		item.setStockNumber(100);
//		item.setRegTime(LocalDateTime.now());
//		item.setRegTime(LocalDateTime.now());

		itemRepository.save(item);
	}

	@Test
	public void insertItemList() {
		for (int i = 0; i < 10; i++) {
			Item item = new Item();
			item.setItemName("상품"+i);
			item.setItemDetail("상세 설명"+i);
			item.setItemSellStatus(ItemSellStatus.SELL);
			item.setPrice(5000);
			item.setStockNumber(100);

			itemRepository.save(item);
		}
	}
	
	@Test
	@DisplayName("상품정보조회")
	public void selectItemList() {
		List<Item> items = itemRepository.findAll();
		for (Item item: items) {
			System.out.println(item);
		}
	}
	
	@Test
	@DisplayName("상품명, 상품 상세설명")
	public void findByItemNameOrItemDetailTest() {
//		this.createItemList();
		List<Item> items = itemRepository.findByItemNameOrItemDetail("상품2","상세 설명2");
		for (Item item: items) {
			System.out.println(item);
		}
	}
	

	@Test
	@DisplayName("가격 Lessthan 테스트")
	public void findByPriceLessthanTest() {
//		this.createItemList();
		List<Item> items = itemRepository.findByPriceLessThan(100);
		for (Item item: items) {
			System.out.println(item.toString());
		}
	}
	
	@Test
	@DisplayName("가격 Lessthan 테스트")
	public void findByPriceGreaterthanEqualTest() {
//		this.createItemList();
		List<Item> items = itemRepository.findByPriceGreaterThan(100);
		for (Item item: items) {
			System.out.println(item);
		}
	}
	
	@Test
	@DisplayName("Query 조회 테스트")
	public void queryTest() {
		List<Item> items = itemRepository.findItemDetail("상세 설명");
		for (Item item: items) {
			System.out.println(item);
		}
	}
	
	
	@Test
	@DisplayName("Query 조회 테스트")
	public void queryTest2() {
		List<Item> items = itemRepository.findItemDetail2("상세 설명");
		for (Item item: items) {
			System.out.println(item);
		}
	}
	
	
	@Test
	public void getNameTest() {
		List<Item> items = itemRepository.findName(100);
		for (Item item: items) {
			System.out.println(item);
		}
	}
	
	@Test
	@DisplayName("Querydsl 조회 테스트")
	public void queryDslTest() {
		BooleanBuilder builder =new BooleanBuilder();
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);
		QItem qitem = QItem.item;
		JPAQuery<Item> query=queryFactory.selectFrom(qitem)
				.where(qitem.itemSellStatus.eq(ItemSellStatus.SELL))
				.where(qitem.itemDetail.like("%"+"상세 설명"+"%"))
				.orderBy(qitem.price.desc());
		List<Item> items = query.fetch();
		
		for (Item item: items) {
			System.out.println(item);
		}
				
	}
}
