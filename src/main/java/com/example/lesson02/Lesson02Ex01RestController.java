package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBo;
import com.example.lesson02.model.UsedGoods;

@RestController // **View 연결  // @Controller + @ResponseBody   - API (음식 돌려주는 역할 , 데이터 가공 = server, JSON을 내려 주는 역할.)
public class Lesson02Ex01RestController {

	@Autowired  // 해당하는 Spring Bean을 찾아 사용할 수 있도록 한다. DI(Depency Injection) 의존성 주입이라고 한다.
	private UsedGoodsBo usedGoodsBo;   // **BO와 연결
	
	
		// http://localhost/lesson02/ex01
		@RequestMapping("/lesson02/ex01")  //**View 연결 // url path 매핑 // 그냥 주소임. 메소드와 연관 없음.
		public List<UsedGoods> ex01() {  // UsedGoods - model명 
			List<UsedGoods> usedGoodsList = usedGoodsBo.getUsedGoodsList();  //**BO와 연결. //  DB에서 가져오는 거기 때문에
			return usedGoodsList;  // list -> JSON String      Response body에 들어감.
			
			
		}
}
