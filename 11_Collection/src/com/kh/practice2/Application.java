package com.kh.practice2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice2.Application;

public class Application {

	public static void main(String[] args) {
	
		Application app =new Application();
		app.method1();
//		app.method2();

}
	//TreeSet
	public void method1() {
		TreeSet<Integer> lotto = new TreeSet<>();
		//size
		for(int i=0; lotto.size() < 6; i++){
		int num = (int)(Math.random()* 45) +1;
		lotto.add(num);
	}
		// 내 번호는 반복문 안에 반복문

		int count = 0;
		while(true) {
			TreeSet<Integer> myLotto = new TreeSet<>();

			for(int j=0; myLotto.size() < 6; j++){
				int num2 = (int)(Math.random()* 45) +1;
				myLotto.add(num2);
			}
			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호 : " + myLotto);
			count++;
			
			if(lotto.equals(myLotto)) {
				System.out.println("횟수 : "+ count);
				break;
			} else {
			}
		
			// 내 번호가 랜덤 6개 숫자 추출
			// 내 번호랑 로또 번호가 일치한지
			// 횟수!
		}
	
}	
	public void method2() {
		
	}
}
