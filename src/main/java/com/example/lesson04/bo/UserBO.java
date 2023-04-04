package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.UserMapper;
import com.example.lesson04.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserMapper userMapper;
	
	// input: 이름, 이메일, 생년월일, 자기소개    output: void or int 
	public void addUserAsField(
		String name, String yyyymmdd, 
		String email, String introduce) {
		
		userMapper.insertUserAsField(name, yyyymmdd, email, introduce);
	}
	
	
	// input:x      output: User(최신 가입자)
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}
	
	
	// ouput:boolean        input:name
	public boolean existUserByName(String name) {
		return userMapper.existUserByName(name);
	}
}
