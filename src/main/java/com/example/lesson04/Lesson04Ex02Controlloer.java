package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.model.Student;

@RequestMapping("/lesson04/ex02") // 공통으로 할때는 이거 씀.
@Controller
public class Lesson04Ex02Controlloer {
	
	@Autowired
	private StudentBO studentBO;
	
	
	// 
	//localhost/lesson04/ex02/add_student_view
	@GetMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	
	//localhost/lesson04/ex02/add_student_view/add_student
	@PostMapping("/add_student") // get 허용 안되게 PostMapping
	public String addStudent(	
			// ****name 속성의 파라미터명과 일치하는 필드에 값이 들어간다. 자동으로 setter가 불려진다. //???name??
			//@RequestParam 어노테이션 대신 사용한다.
			//폼 태그의 name 속성과 DTO 객체의 필드명이 일치하는 데이터를 세팅해서 객체로 한번에 받아온다.
			@ModelAttribute Student student, 		
			Model model) {
		
		//** 흐름 중요 **
		// DB insert
		studentBO.addStudent(student);  // 이 줄만 지나오면 id가 무엇인지 알 수 있다. 내부적으로 insert 됨
		
		// DB select - 지금 가입한 사람 정보를 db에서 select
		Student latestStudent = studentBO.getStudentById(student.getId());  // 위에 student 객체 안에 getId 가 불려짐 (getter) // breakpoint
		
		
		// Model에 데이터를 담는다. (mvc)
		model.addAttribute("result", latestStudent); // ""안에 값은 jsp로 보내질 값. (el문법)
		model.addAttribute("title", "최근 가입된 학생 정보");
		
		
		// 추가된 학생 정보를 보여주는 jsp
		return "lesson04/afterAddStudent";  // break point 중괄호 거는 위치 
		
	}
}
