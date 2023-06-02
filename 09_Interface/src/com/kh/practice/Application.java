package com.kh.practice;

public class Application {
// 실선-- 구현 점선--상속
	public static void main(String[] args) {
		Iphone14Pro iphone = new Iphone14Pro();
		iphone.printInformation();	
		
		System.out.println();
		
		S23Ultra s23 = new S23Ultra();
		s23.printInformation();
		}
}
