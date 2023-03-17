package com.example.lesson01;

public class Data {
	// 필드
	private int id;
	private String name;
	
	
	// 메소드
	public int getId() {
		return this.id;
	}
	
	
	//setter - 세팅할거니깐 리턴할꺼 없어서 void
	public void setId(int id) {
		this.id = id;
	}
	
	//getter - 돌려줄꺼니깐 String
	public String getName() {
		return this.name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
}
