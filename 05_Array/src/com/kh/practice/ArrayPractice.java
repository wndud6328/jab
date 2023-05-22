package com.kh.practice;

import java.util.Arrays;

import java.util.Scanner;

import com.kh.array.B_Dimension;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		String [][] arr = new String [][]{"사과","포도","귤","배","키위"};

	for(int i = 0; i<arr.length; i++) {
		System.out.println(Arrays.toString(arr));
	}	
}
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		double[] arr = new double[5];
		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("정수 : ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
	}
		/*
		System.out.print("정수 : ");
		sc.nextInt();
		int [][] arr = new int[][] {{4, -4, 3, -4, 2}};
		double sum = 0;
		*/
		
		for (int i=0; i<arr.length; i++) {
			sum+= 0;
			System.out.println(sum);
			break;
		}
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		String name = "";
		
		String[] arr = new String [] {"피자", "햄버거","순대볶음","곱창","마라샹궈","마라탕"};
			for (int i=0; i<arr.length; i++)	
				name = sc.nextLine();
	
			if(equals(name)) {
					System.out.println("배달가능");
				} else {
					System.out.println("배달 불가능");
				}
			}

	
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
	
		
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
		
		System.out.print("단어입력: " );
		String word = sc.nextLine();
		charAt(0) =
		
		
		
	}

public static void main(String[] args) {
	
	ArrayPractice a = new ArrayPractice();
//	a.method1();
//	a.method2();
//	a.method3();
//	a.method4();
	a.method5();
	
}
}
