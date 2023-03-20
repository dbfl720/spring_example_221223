package com.example.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.model.UsedGoods;

@Repository
public interface UsedGoodsMapper {
	
	// input: x, 다 달라고 함.   // ouput: List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();
	
}
