package com.kh.run;

import com.kh.first.*;

public class RunA {

	public static void main(String[] args) {
		
		System.out.println("프로그램실행!!");
		
		// 다른 클래스에 있는 메소드를 실행하고자 할 때
		
		// 1) 실행할 메소드가 있는 클래스를 생성()
		// [표현법] 클래스명 사용할이름  = new 클래스명();
		//A_MethodPrinter amp = new A_MethodPrinter();	
		// => 코드를 기술하고 있는 RunA 클래스가 속해있는 패키지에 해당 클래스가 없기 때문에 
		//	    같은 패키지 내에 해당 클래스를 찾을 수 없기 때문에 오류!!
		
		// 해결방법1. 생성하고자 하는 클래스가 어떤 패키지에 속해있는지 풀 클래스명을 제시하는 방법
		//com.kh.first.A_MethodPrinter amp = new com.kh.first.A_MethodPrinter();
		
		// 해결방법2. 클래스명만을 가지고 생성을 하되 이 클래스가 어느 패키지에 속해 있는지 단 한번 선언(import)해 주는 방법
		A_MethodPrinter amp = new A_MethodPrinter();
		
		// 2) 메소드 실행(호출)
		// [표현법] 사용할이름.실행할메소드명();
		amp.methodA();
		//amp.methodB();
		//amp.methodC();
		
	}

}
