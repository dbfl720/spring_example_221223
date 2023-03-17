package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // jsp로 뿌릴 때는 @Controller - view 화면으로 뿌릴때는 그냥 controller 
public class Lesson01Ex03Controller {
	
	// http://localhost/lesson01/ex03 
	@RequestMapping("/lesson01/ex03")  // **** 밑에 return주소와 아무런 관련없다!! 
	public String ex03() {
		// @ResponseBody없이 단독 @Controller만 사용되는 경우
		// return String( 무조건 해야 됨 - view 경로) ViewResolver에 의해 jsp 경로를 찾는다. 
		
		
		//return "/WEB-INF/jsp/lesson01/ex03/jsp";  // jsp view에 경로
		// application.properties에 있는 prefix와 suffix 제외한 경로만 쓴다.
		return "/lesson01/ex03";  // jsp view에 경로****
	}
}
