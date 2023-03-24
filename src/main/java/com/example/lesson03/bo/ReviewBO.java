package com.example.lesson03.bo;

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
	
	
	// input: Review        output: int (성공한 행의 개수) - mybatis가 해줌.
	public int addReview(Review review) {  // 자료형, 이름 
		return reviewMapper.insertReview(review);
	}
	
	
	// addReviewAsField(4,"콤비네이션R", "마이켈", 5.0, "역시 맛있다!!");
//	사실 매개변수라서 이름명 컬럼명과 동일안하게 안해도됨.
	public int addReviewAsField(
			int storeId111, String menu111, String userName111,
			Double point111, String review111) {
		
		return reviewMapper.insertReviewAsField(storeId111, menu111, userName111, point111, review111);
	}
	
	
	// input: id, review   output: 성공된 행의 개수 int
	public int updateReviewById(int id, String review) {// by 뒤는 where절임.
		return reviewMapper.updateReviewById(id, review);
	
	}
	
	// input : id    output : x
	public void deleteReviewById(int id) { // where 절에 들어가는건 다 By뒤에 쓰면 됨.
		reviewMapper.deleteReviewById(id);
	}
}
