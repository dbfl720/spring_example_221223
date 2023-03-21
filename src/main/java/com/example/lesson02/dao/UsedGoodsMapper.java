package com.example.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.model.UsedGoods;

@Repository   // **@Repository  DAO를 Spring Bean으로 만들기 위해 
public interface UsedGoodsMapper {  // interface라서 구현체 없음.
	
	// input: x, 다 달라고 함.   // output: List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();  // **메소드명 (select + _______) // database로 오면 select 쿼리문과 똑같이 해야됨.
	
}
