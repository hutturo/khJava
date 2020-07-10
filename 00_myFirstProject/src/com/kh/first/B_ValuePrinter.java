package com.kh.first;

public class B_ValuePrinter { // com.kh.first.B_ValuePrinter

	/*
	 *  ** 원칙 **
	 *  1. 클래스명 --> 대문자로 시작
	 *  2. 패키지명 --> 소문자로 시작
	 *  3. 메소드명 --> 소문자로 시작
	 *  4. 변수명    --> 소문자로 시작
	 *  
	 *  단, 여러개의 단어가 있을 때는 단어 앞자리마다 대문자로!! == 낙타표기법(개발자간의 예의)
	 *  
	 *  ex) 클래스명 Methodprinter		=> MehodPrinter
	 *  	메소드명 printvalue			=> printValue
	 *  
	 *  그리고 항상 의미있게 이름 짓자!!
	 */
	
	// 다양한 종류의 값들을 출력하는 기능의 메소드
	public void printValue() {
		
		// 1. 숫자 출력		--> 따옴표 없이
		System.out.println(123);	// 정수값 출력
		System.out.println(1.23);	// 실수값 출력
	}
	
}
