package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBo;
import com.example.lesson02.model.UsedGoods;

@RestController
public class Lesson02Ex01RestController {

	@Autowired
	private UsedGoodsBo usedGoodsBo;
	
	
		// http://localhost/lesson02/ex01
		@RequestMapping("/lesson02/ex01")
		public List<UsedGoods> ex01() {
			List<UsedGoods> usedGoodsList = usedGoodsBo.getUsedGoodsList();  //DB에서 가져오는 거기 때문에
			return usedGoodsList;  // list -> JSON String      Response body에 들어감.
			
			
		}
}
