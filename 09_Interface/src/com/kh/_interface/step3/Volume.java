package com.kh._interface.step3;

public interface Volume {

	// 인터페이스 = 추상 메서드 + 상수
/*	public static final */ int MAX_VOLUME = 10;
/*	public static final */ int MIN_VOLUME = 0;

	// 인터페이스에서 메서드는 무조건 추상 메서드!
/* public abstract */ void setVolume(int volume);

}
