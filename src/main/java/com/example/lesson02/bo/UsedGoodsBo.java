package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsMapper;
import com.example.lesson02.model.UsedGoods;

@Service
public class UsedGoodsBo {
	
	@Autowired  // spring bean을 들고 오고 싶을 때 씀. DI(Dependency Injection) :spring container에 있는 spring bean을 주입한다. - 3가지 방법 있음.
	private UsedGoodsMapper usedGoodsMapper;   // 자료형, 객체명..?
	
	


	// input: x  // 다 주세요 할꺼라서..없음.
	// output: List<UsedGoods>
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		return usedGoodsList;
				
	}
}
