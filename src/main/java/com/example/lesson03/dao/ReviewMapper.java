package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

// 역할 : mybatis에서 xml을 찾아줌
@Repository
public interface ReviewMapper {

	// mybatis에서 사용되는거라서.   @Param 
	public Review selectReview(@Param("id")int id);  //bo 함수명을 복사해서 select명만 바꾸면 됨.
}
