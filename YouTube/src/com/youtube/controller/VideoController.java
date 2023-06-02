package com.youtube.controller;

import java.util.Date;

import com.youtube.model.Video;

public class VideoController {

	Video[] videoList = new Video[5];
	int index = 0;
	
	public void upload(Video video) { //영상 업로드
		videoList[index++] = video;
	}
	public Video[] videoList() { // 동영상 목록
		return videoList;
	}
	public Video viewVideo(int index) { // 동영상1개 보기
		return videoList[index];
	}
	public void updateVideo(int index, Video video) { // 동영상 수정
		videoList[index] = video;
	}
	public boolean deleteVideo() { // 동영상 삭제
		return false;
	}
	
	
//	private VideoController v = new VideoController();
//	
//	public VideoController() {}
//	
//	/*
//	 * Create : 추가
//	 * Read : 읽기 (1개, 목록)
//	 * Update : 수정
//	 * Delete : 삭제
//	 * */
//	
//	public boolean saveData(VideoController v) {
//		
////		this.v.setTitle(v.getTitle());
////		this.v.setcomment(v.getcommet());
////		this.v.setUploadAt(v.getUploadAt());
////		this.v.setCount(v.getCount());
////		this.v.setimgUrl(v.getImgUrl());
////		this.v.setFileUrl(v.getFileurl());
////	
//		return true;
//	}
//
//	public VideoController confirmData() {
//		return this.v;
//	}

}
