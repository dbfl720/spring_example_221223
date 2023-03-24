package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//역할 : mybatis에서 xml을 찾아줌
@Repository
public interface UserMapper {

	//@Param 을 사용하면 하나의 map으로 만들어준다.
	public void insertUserAsField(
			//name,yyyymmdd,email,introduce
			@Param("name") String name,
			@Param("yyyymmdd") String yyyymmdd,
			@Param("email") String email,
			@Param("introduce") String introduce);
}
