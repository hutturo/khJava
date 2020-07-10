package com.kh.chap02_loop.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 *  * while문
	 *  
	 *  while () {
	 *  	반복적으로 샐행시키고자하는 구문
	 *  	증감식;
	 *  }
	 * 
	 */

	public void method1() {
		// 안녕하세요 5번 출력
		
		int i = 1;
		
		while (i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
	
		// 1 2 3 4 5
		
		i = 1;
		
		while (i <= 5 ) {
			System.out.print(i + " ");
			i++;
		}
		
		// 5 4 3 2 1
		
		i = 5;
		
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}
		
	}
	
	public void method2() {
		// 1에서부터 10까지의 홀수만을 출력
		// 1 3 5 7 9
		
		int i = 1;
		
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		i = 1;
		
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
	}
	
	public void method3() {
		
		// 1에서부터 랜덤한 수(1~50)까지의 합계
		int random = (int) (Math.random() * 50 + 1);
				
		System.out.println("랜덤값 : " + random);
		
		int sum = 0;
		int i = 1;
		
		while (i <= random) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		System.out.println("\n1에서부터 " + random + "까지의 합 : " + sum);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : " + str.length());
		
		int i = 0;
		
		while (i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		
	}
	
	public void method5() {
		// 사용자가 입력한 단 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수(2~9) 입력 : ");
		int dan = sc.nextInt();
		
		
		if (dan >= 2 && dan < 10) {
			System.out.println("=== " + dan + "단 ===");
			
			int i = 1;
			
			while (i < 10) {
				System.out.println(dan + " x " + i + " = " + dan * i);
				i++;
			}
			
		} else {
			System.out.println("2~9사이의 숫자를 입력해야됩니다.");
		}
		
	}
	
}
