package com.kh.example.practice3.model;

public class Lotto {
	
	public static Lotto l;
	int[] lotto = new int [6];
	
	public String information() {
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45)+i;
			
			for (int j=0;  j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		} 
		return "";	
	}	
	
	
}
