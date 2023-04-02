package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;


//웹 주소로 요청하면, 웹사이트 View 화면이 아닌 json 같은 데이터를 응답값으로 보내준다.
//이러한 요청을 API(Application Programming Interface) 라고 한다.
//@Controller + @ResponseBody가 합쳐진 어노테이션이다.
//@ResponseBody를 생략해도 메소드에서 리턴된 데이터가 response body 영역에 넣어 보내진다.
//API 형태로 데이터를 리턴할 경우 자주 사용한다.
@RestController
public class Lesson03Ex03RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// localhost/lesson03/ex03?id=23&review=도미노 피자는 역시 맛있어~~
	@RequestMapping("/lesson03/ex03")
	public String ex03(
			@RequestParam("id") int id,
			@RequestParam("review") String review) {
		
		int rowCount = reviewBO.updateReviewById(id, review);
		return "변경 완료: " + rowCount;
	}
}
