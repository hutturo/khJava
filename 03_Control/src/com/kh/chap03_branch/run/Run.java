package com.kh.chap03_branch.run;

import com.kh.chap03_branch.branch.A_Break;
import com.kh.chap03_branch.branch.B_Continue;

public class Run {

	public static void main(String[] args) {

		// 프로그램 흐름을 제어하는 제어문 중 하나인 분기문 (반복문 안에서만 쓰임!)
		// break, continue
		
		A_Break ab = new A_Break();
		
//		ab.method1();
//		ab.method2();
//		ab.method3();
		
		B_Continue bc = new B_Continue();
		
//		bc.method1();
//		bc.method2();
		bc.method3();
		
	}

}
