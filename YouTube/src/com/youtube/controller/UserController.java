package com.youtube.controller;

import com.youtube.model.User;

public class UserController{
	
	User user = null;
	
	public boolean login(String id, String password) {// 로그인
		if(user!=null && user.getId().equals(id) 
				&& user.getPassword().equals(password))
			return false;
		return false;
	}
	
	public void signUp(User user) { // 회원가입
		this.user = user;
		return ;
	}

	public User viewProfile() { // 프로필 보기
		if(login(user.getId(), user.getPassword())) {
			return user;
		}
		return null;
	}
	
	public User updateProfile(User user) { // 프로필 수정
		if(login(user.getId(), user.getPassword())) {
			this.user = user;
		}
		return user;
	}
	
	public void deleteProfile(String id) { // 계정 삭제
		if(user.getId().equals(id)) {
			user = null;
		}
	}
}
