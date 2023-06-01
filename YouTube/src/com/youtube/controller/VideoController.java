package com.youtube.controller;

import java.util.Date;

import com.youtube.model.Video;

public class VideoController implements UserControllerImpl {

	private VideoController v = new VideoController();
	
	public VideoController() {}
	
	/*
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 * */
	
	public boolean saveData(VideoController v) {
		
//		this.v.setTitle(v.getTitle());
//		this.v.setcomment(v.getcommet());
//		this.v.setUploadAt(v.getUploadAt());
//		this.v.setCount(v.getCount());
//		this.v.setimgUrl(v.getImgUrl());
//		this.v.setFileUrl(v.getFileurl());
	
		return true;
	}

	public VideoController confirmData() {
		return this.v;
	}

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean signUp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserController viewProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserController updateProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProfile() {
		// TODO Auto-generated method stub
		return false;
	}
	


}





