package com.kh.run;

import com.kh.variable.*;

public class Run {

	public static void main(String[] args) {
		
		// 1) ������ �޼ҵ尡 �ִ� "Ŭ���� ����(new)"�ϱ�!
		// [ǥ����] Ŭ������ ������ = new Ŭ������();
		A_Variable av = new A_Variable();
		
		// 2) �޼ҵ� ȣ��(����)
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
