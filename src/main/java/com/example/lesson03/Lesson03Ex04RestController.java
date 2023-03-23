package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;

@RestController
public class Lesson03Ex04RestController {
	
	
	@Autowired
	private ReviewBO reviewBO;
	
	//localhost/lesson03/ex04?id=22      
	@RequestMapping("/lesson03/ex04")
	public String ex04(
			@RequestParam("id") int id) {  // ** @RequestParam(id)은 위에 주소 id임.
			
		
		reviewBO.deleteReviewById(id);
		return "삭제 완료";
	}
}
