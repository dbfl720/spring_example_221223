package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson04/ex01")
@Controller  // 만약에 return string => jsp view를 찾아줌. 
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;
	
	
	// localhost/lesson04/ex01/add_user_view  
	// 하나의 경로만(get) 지정하고 싶으면  - method=RequestMethod.GET
	@RequestMapping(path="/add_user_view", method=RequestMethod.GET)  // RequestMapping - 모든 메소드 허용함 get, post 등
	public String addUserView() {
		//       /WEB-INF/jsp/lesson04/addUser.jsp 
		return "lesson04/addUser";  // view 경로를 리턴임.
	}
	
	// 응답 먼저 디버깅으로 확인하고 insert하고 디버깅 확인.
	// localhost/lesson04/ex01/add_user     // 데이트 처리
	@PostMapping("/add_user") //post방식으로만 허용되는 주소만 들어옴
	public String addUser(
			@RequestParam("name") String name,   // *** addUser에 있는 name이 @RequestParam("name")들어감.
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value="email", required=false) String email, //비필수라서 
			@RequestParam(value="introduce", required=false) String introduce) { 
			
		
		//insert DB // 요청 //쿼리로 작성..
		// UserBO UserMapper userMapper.xml User
		
		userBO.addUserAsField()
		
		
		
		
		
		
		
		
		// 결과 jsp view  // 응답
		return "lesson04/afterAddUser";  // 실제 코드가 수행되는 곳에 디버깅 브레이크포인트 거는 거임.
		
	}
}
