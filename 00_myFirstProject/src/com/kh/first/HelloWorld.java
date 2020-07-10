package com.kh.first;

// 주석 : 소스코드와 무관한 즉, 코드로 인식안됨!! => 주로 코드에 대한 설명을 작성할 때 사용

/*
 * 여러줄
 * 주석
 */

public class HelloWorld {
	
	// 기능 == 메소드
	// 한 클래스 안에 여러 개의 메소드 만들 수 있음!!
	// 프로그램 실행 시 제일 먼저 실행되는 메소드 == main메소드(실행메소드)
	public static void main(String[] args) {
		
		// 화면에 출력하고 싶을 때 출력문을 통해 작업(print, println, printf)
		
		// System.out.print("출력하고자하는 값"); --> 해당 구문 출력 후 "한줄 띄어주는" 역할
		System.out.println("Hi, EveryOne!!!");
		
		// System.out.print("출력하고자하는 값"); --> 해당 구문 출력만 하고 끝 --> 한 줄 띄어쓰기 X
		System.out.print("안녕하세요~~");
		
		System.out.println("여러분~~");
		
		// 각 클래스마다 역할별로 나눠서 관리
		// 각 클래스안에서도 해당 코드들도 각 기능별로 메소드로 따로 작성!!
	}

}
