package com.kh.practice;

import java.util.Scanner;


public class OperatorPractice {

	public static void main(String[] args) {	
		OperatorPractice o = new OperatorPractice();
//		o.method1(); 0
//		o.method2(); 0
//		o.method3(); 
//		o.method4(); 0
//		o.method5(); 0
		o.method6(); 
	}
	public void method1(){
		
	
		int number = 0;
		int pencil = 0;
		int pen1 = 0;
		int pen2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수: " );
		number = sc.nextInt();
		
		System.out.print("연필 개수: " );
		pencil = sc.nextInt();
		
		pen1= (pencil / number);
		pen2= (pencil % number);
		
		System.out.println("1인당 연필 개수 : " + pen1);
		System.out.println("남는 연필 개수 : " + pen2);
		
		
		
	}
	public void method2() {
		
		int num = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 > ");
		sc.nextLine().charAt(0);
	
		
		
		
		
	}
	public void method3() {
		
		int num1;
		int num2;
		int num3;
		boolean result = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 > " );
		num1 = sc.nextInt();
		
		System.out.print("입력2 > " );
		num2 = sc.nextInt();
		
		System.out.print("입력3 > " );
		num3 = sc.nextInt();
		
		result = (num1 == num2) && (num2 == num3);
		System.out.println(result);
		
	}
	public void method4() {
		int num1 = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		num1 = sc.nextInt();
		
		result = (num1 % 2 == 0) ? "짝수다" : "홀수다";
		System.out.print(result);
			
	}
	public void method5() {
		int age = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : " );
		age = sc.nextInt();
		
		result = (age > 19) ? "성인" : (age <= 19) ? "청소년" : "아이" ;
		System.out.println(result);
	}
	public void method6() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String result = "";
		boolean result1 = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		num2 = sc.nextInt();
		
		num3 =  (num1/ num2 );
		System.out.print(result1);
		System.out.print("필요한 바구니의 수 : " + num3);

	}
}

	
