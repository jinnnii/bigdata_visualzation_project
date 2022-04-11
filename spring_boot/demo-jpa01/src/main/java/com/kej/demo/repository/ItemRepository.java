package com.kej.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import com.kej.demo.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long>,QuerydslPredicateExecutor<Item>{
	//데이터 저장, list조회, entity 1개 조회, 수정, 삭제, 작성하기

	List<Item> findByItemNameOrItemDetail(String string, String string2);

	List<Item> findByPriceLessThan(int i);

	List<Item> findByPriceGreaterThan(int i);
 
	List<Item> findByItemDetail(String detail);
	@Query("select i from Item i "
			+ "where i.itemDetail like %:itemDetail%")
	List<Item> findItemDetail(@Param("itemDetail") String itemDetail);//필드 기준
	
	@Query(value="select * from item "
			+ "where item_detail like %:itemDetail%",nativeQuery=true)
	List<Item> findItemDetail2(@Param("itemDetail") String itemDetail);//쿼리 기준
	
	@Query("select i from Item i where i.price =100")
	List<Item> findName(@Param("price") int price);
	
}
