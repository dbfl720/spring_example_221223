package com.example.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewMapper;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {

	
	@Autowired
	private ReviewMapper reviewMapper;
	
	
	
	// input: x  output:Review
	public Review getReview(int id) {  // 반드시 id가 있어야됨.  Integer 쓰면 안됨. ->null일 수 있을 때만 씀. 
		return reviewMapper.selectReview(id);
	}
}
