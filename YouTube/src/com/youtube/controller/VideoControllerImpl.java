package com.youtube.controller;

import com.youtube.model.Video;

public interface VideoControllerImpl {
	public Video upload();		// 영상 업로드
	public Video[] videoList(); // 영상 리스트
	public Video viewVideo(); 	// 영상 1개 보기
	public Video updateView();	// 동영상 수정
	public Video deleteVideo(); // 동영상 삭제
}
