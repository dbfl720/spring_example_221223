package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController	// @Controller + @ResponseBody   - API (음식 돌려주는 역할 , 데이터 가공 = server, JSON을 내려 주는 역할.)
public class Lesson01Ex01RestController {

	// http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>@RestController를 사용해서 String을 리턴해본다.</h3>";
	}
	
	
	// http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
			map.put("aaaa", "1111");
			map.put("bbbb", "1111");
			map.put("cccc", "1111");
			return map;
	}
	
	
	
	// http://localhost:8080/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data();  // 일반 자바 bean(객체) - new를 했을 때 객체가 만들어지면 bean
		data.setId(1);
		data.setName("홍유리");
		return data;   // json String
		
	}
	
		
	
	// http://localhost:8080/lesson01/ex01/6
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data(); // ** new를 할 수있는 건 일반 자바 bean
		data.setId(1);
		data.setName("홍유리");
		
		//return new ResponseEntity<>(data, HttpStatus.OK);  // 잘 안쓰임. /200 OK / 1.내가 최종적으로 내릴 데이터를 넣음. 2.상태번호 (결과가 성공인지, 실패인지 번호 내려줌.
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);  // // 500 internal server error잘 안쓰임. /200 OK / 1.내가 최종적으로 내릴 데이터를 넣음. 2.상태번호 (결과가 성공인지, 실패인지 번호 내려줌.
	}
}

