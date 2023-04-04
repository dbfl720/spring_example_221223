package com.example.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson06/ex01")
@Controller
public class Lesson06Controller {
	
	
	@Autowired
	private UserBO userBO;
	
	// http://localhost/lesson06/ex01/add_user_view
	@GetMapping("/add_user_view")
	public String addUserView() {
		return "lesson06/addUser";
	}
	
	// *** AJAX 통신으로 오는 요청 결과는 반드시 String이다. 반드시 return 해야됨. // *** 반드시 @ResponseBody 있어야됨.
	@PostMapping("/add_user") 
	@ResponseBody  //  데이터를 돌려주는 어노테이션/ 웹 주소로 요청하면, 웹사이트 View 화면이 아닌 json 같은 데이터를 응답값으로 보내준다. 컨트롤러 메소드의 리턴값이 데이터가 되어, Response 응답값의 body 영역에 넣어 보낸다. 만약 String을 리턴한 경우 텍스트 기반 HTML 형식으로 response body에 나타난다.
	public String addUser(  // 필수, 비필수는 db에서 확인
			@RequestParam("name") String name,  
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value="email", required=false) String email,
			@RequestParam(value="introduce", required=false) String introduce){
		
		
		// insert
		userBO.addUserAsField(name, yyyymmdd, email, introduce);
		return "성공";
	}
	
	@GetMapping("/result_view")
	public String resultView() {
		return "lesson06/result";
	}
}
