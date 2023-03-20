package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // 공통된거 적음.
@Controller		// Spring container가 관리해주는 Spring bean // controller와 requestmapping 쌍임.
public class Lesson01Ex01Controller {
	
	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody	// 리턴되는 String이 통째로 ResponseBody에 담긴다. ** 매우 중요 ** 꼭 붙어 있어야함.
	@RequestMapping("/1")	// url path 매핑 // 그냥 주소임. 메소드와 연관 없음.
	public String ex01_1() { // 응답은 여기서 만들어짐.
		String text = "예제1번<br>문자열을 response body에 보내는 예제";
		return text;
	}
	
	
	// http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		// {"망고"=3, "석류"=15 ... } java map
		// {"망고":3, "석류":15 ... } JSON String
		
		Map<String, Object> map = new HashMap<>();
		map.put("망고", 3);
		map.put("석류", 15);
		map.put("청포도", 20);
		map.put("블루베리", 59);
		
		// map => JSON 변환
		// web starter안에 포함된 jackson 라이브러리가 포함되어 있고 동작하기 때문. 
		return map;
	}
}
