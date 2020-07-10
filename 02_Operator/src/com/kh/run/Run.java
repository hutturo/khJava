package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Triple;
import com.kh.operator.G_Compound;
import com.kh.practice.example.OperatorPractice;

public class Run {

	public static void main(String[] args) {
		
		A_LogicalNegation aln = new A_LogicalNegation();
		
//		aln.method();
		
		B_InDecrease bid = new B_InDecrease();
		
//		bid.method1();
//		bid.method2();
//		bid.method4();
//		bid.method5();
		
		C_Arithmetic ca = new C_Arithmetic();
		
//		ca.method1();
//		ca.method3();
		
		D_Comparison dc = new D_Comparison();
		
//		dc.method1();
		
		E_Logical el = new E_Logical();
		
//		el.method1();
//		el.method2();
//		el.method3();
//		el.method4();
		
		F_Triple ft = new F_Triple();
		
//		ft.method1();
//		ft.method2();
//		ft.method3();
//		ft.method4();
//		ft.method5();
//		ft.method6();
		
		G_Compound gc = new G_Compound();
		
//		gc.method1();
		
		OperatorPractice op = new OperatorPractice();
		
//		op.practice7();
		op.practice8();
		
	}

}
