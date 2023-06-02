package com.kh._interface.step3;

public interface RemoteControl extends Searchable, Volume { //extends 는 인터페이스는 다중상속 가능

	void turnOn();
	void turnOff();
	
}
