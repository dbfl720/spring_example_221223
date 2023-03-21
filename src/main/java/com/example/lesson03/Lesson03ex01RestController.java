package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController  // 안쓰면 null 에러 나옴.
public class Lesson03ex01RestController {

	
	@Autowired
	private ReviewBO reviewBO;
	
	
	//http://localhost/lesson03/ex01?id=5
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			@RequestParam("id") int id // 필수 파라미터  두개이상일때는 value써야됨,하나일때는 value생략.
		 // @RequestParam(value="id") int id    // 필수 파라미터
		 //	@RequestParam(value="id", required=true) int id // 필수 파라미터
		 //	@RequestParam(value="id", required=false) Integer id // 비필수 파라미터
		 //	@RequestParam(value="id", defaultValue="1") int id // 비필수, 디폴트 값 1
			) {
		 return reviewBO.getReview(id);  // list -> JSON
		
	}
}
