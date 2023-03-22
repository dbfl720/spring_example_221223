package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

// 역할 : mybatis에서 xml을 찾아줌
@Repository
public interface ReviewMapper {

	// mybatis에서 사용되는거라서.   @Param 
	public Review selectReview(@Param("id")int id);  //bo 함수명을 복사해서 select명만 바꾸면 됨.
	
	public int insertReview(Review review);   // 쿼리랑 가까워서 insert로 명칭 바꿈.파라미터가 하나일때는 @Param 생략
	// 몇개 성공했는지 알려주는 거임.
	
	
	// @Param이 있기 때문에 하나의 map이 xml로 넘어간다.
	// ** 여기서 중요한 것은 @Param() 안에 있는 단어가 중요 이거는 xml에서 ,#{}에 사용된 이름명임!!!. 옆에는 변수명이라 아무거나 해도됨. 
	public int insertReviewAsField(
			@Param("storeId") int storeId222,
			@Param("menu") String menu222,
			@Param("userName") String userName333,
			@Param("point") Double point333,
			@Param("review") String review333);
	
}
