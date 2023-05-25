package com.kh.example.practice4.Run;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Application {
	
	public static void main(String[] args) {
		SnackController scr = new SnackController();
		
		Scanner sc = new Scanner(System.in);
		
//		Snack s = new Snack("빵","케이크","블루베리",1,15000);
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
//		s.setkind(sc.nextLine());
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		s.setname(sc.nextLine());
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
//		s.setflavor(sc.nextLine());
		
		System.out.print("개수 : ");
		int numOf = (Integer.parseInt(sc.nextLine()));
//		s.setnumOf(Integer.parseInt(sc.nextLine()));
		
		System.out.print("가격 : ");
		int price = (Integer.parseInt(sc.nextLine()));
//		s.setprice(Integer.parseInt(sc.nextLine()));
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
//		s.setkind(kind);
//		s.setname(name);
//		s.setflavor(flavor);
//		s.setnumOf(numOf);
//		s.setprice(price);
//		
		
		if(scr.saveData(s)) {
			System.out.println("저장 완료되었습니다.");
			System.out.println(scr.confirmData());
		}
		
//		
//		System.out.println("저장 완료되었습니다.");
//		System.out.println(scr.confirmData());
		
//		System.out.println(s);
//		System.out.println(s.getkind() + "("+s.getname()+" - " 
//							+ s.getflavor()+ ") " + s.getnumOf()+"개 "+ s.getprice()+ "원");
		
		
	}

}
