package com.kh.run;

import com.kh.variable.*;

public class Run {

	public static void main(String[] args) {
		
		// 1) 실행할 메소드가 있는 "클래스 생성(new)"하기!
		// [표현법] 클래스명 변수명 = new 클래스명();
		A_Variable av = new A_Variable();
		
		// 2) 메소드 호출(실행)
//		av.printValue();
//		av.declareVariable();
//		av.initVariable();
		
		B_Constant bc = new B_Constant();
		
//		bc.finalConstant();
		
		C_KeyboardInput ck = new C_KeyboardInput();
		
//		ck.inputScanner1();
//		ck.inputScanner2();
//		ck.inputScanner3();
//		ck.inputScanner4();
		
		D_Casting dc = new D_Casting();

//		dc.casting1();
//		dc.casting2();
		
		E_Overflow eo = new E_Overflow();
		
//		eo.overflow();
		
		F_Printf fp = new F_Printf();
		
//		fp.printfMethod();
	}

}
