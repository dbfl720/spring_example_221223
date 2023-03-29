package com.example.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("포도");
		fruitList.add("망고");
		fruitList.add("블루베리");
		fruitList.add("딸기");
		model.addAttribute("fruits",fruitList);  // key - fruits  // jsp에서 furits로 꺼내야함.
		
		
		// List<Map>
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "홍유리");
		user.put("age", 20);
		user.put("hobby", "요가");
		userList.add(user);
		
		user = new HashMap<>();
		user.put("name", "초코");
		user.put("age", 13);
		user.put("hobby", "응가");
		userList.add(user);
		
		model.addAttribute("users", userList);
		return "lesson05/ex02";
	}
	
	
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		Date today = new Date();
		model.addAttribute("today", today);
		return "lesson05/ex03";
	}
	
	
	@GetMapping("/ex04")
	public String ex04() {
		return "/lesson05/ex04";
	}
	
}
