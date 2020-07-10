package com.kh.chap04_field.model.vo;

import com.kh.chap04_field.model.vo.FieldTest2;

public class Run {

	public static void main(String[] args) {
		
		// -------------- 1. FieldTest1 ----------
		/*
		FieldTest1 f1 = new FieldTest1(); // 객체생성
		f1.test(5); // 메소드실행
		*/
		
		// -------------- 2. FieldTest2 -----------
		FieldTest2 f2 = new FieldTest2();
		
		// 각 필드에 직접 접근 해볼꺼임
		
		// public --> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected --> 같은 패키지 내 + 다른 패키지일 경우 상속구조 
		System.out.println(f2.pro);
		
		// default --> 같은 패키지 내
		System.out.println(f2.def);
		
		// private --> only 그 클래스에서만
		//System.out.println(f2.pri);
		
		

	}

}





