package com.youtube.controller;

public interface UserControllerImpl {

	public boolean login();// 로그인
	public boolean signUp(); // 회원가입
	public UserController viewProfile(); // 프로필 보기
	public UserController updateProfile();  // 프로필 수정
	public boolean deleteProfile(); // 계정 삭제
}