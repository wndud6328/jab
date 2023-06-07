package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice3.model.Farm;

public class FarmController {

	private HashMap<Farm, Integer> hMap = new HashMap<>(); // 마트에서 농산물 저장용
	private ArrayList<Farm> list = new ArrayList<>();      // 고객이 구매한 농산물 저장용
	
	public boolean addNewKind(Farm f, int amount) {
			
		if(hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
	} else {
		return false;		
	}
	}	// containsKey() : map에 key가 존재 하는가
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		// f와 amount를 각각 키와 값으로 저장 후 true 반환
		
		// 존재할 경우 false 반환
		
	
	
	
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
	} else {
		return false;		
	}
	}
		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// hMap에 f 삭제 후 true 반환
		
		// 존재하지 않을 경우 false 반환
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
	} else {
		return false;		
	}
	}
		// 전달 받은 f가 hMap 안에 key로 존재할 때 
		// f와 amount 저장 후 true 반환
		
		// 존재하지 않을 경우 false 반환
		
	
	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}
	
	// 고객 관련 기능 ------------------------------------------------------------
	
	public boolean buyFarm(Farm f) {
		if(hMap.containsKey(f)) {
		
			list.add(f);
			hMap.put(f, -1);
			return true;		
	} else {
	} return false;			
	}
	
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환
		
		// 존재하지 않으면 false 반환

		
	
	public boolean removeFarm(Farm f) {
		if(list.contains(f)) {
			list.remove(f);
			hMap.put(f, +1);
			return true;
	} else {
		return false;		
	}
	}
	
		// 전달 받은 f가 list에 존재할 때 
		// list에 f 삭제, 그리고 hMap에 f 수량 1 증가, true 반환
		
		// 아니면 false 반환
		
		
	
	
	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
