package com.kh.operator;

public class C_Arithmetic {
	
	// ��� ������ (���� ������ == �� ���� ���� ������ �����ϴ� ������)
	// + - * 

	public void method1() {
		
		int num1 = 10;
		int num2 = 4;
		
		//					"num1 + num2 = 10"	+ num2
		//						"num1 + num2 = 104"
		System.out.println("num1 + num2 = " + (num1 + num2)); // 14
		System.out.println("num1 - num2 = " + (num1 - num2)); // 6
		System.out.println("num1 x num2 = " + (num1 * num2)); // 40
		System.out.println("num1 / num2 = " + (num1 / num2)); // 2.5
		System.out.println("num1 % num2 = " + (num1 % num2)); // 2
		
	}
	
	public void method3() {
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;	//	a=6 b=10 c=16
		
		int d = c / a; 		//	a=6 b=10 c=16 d=2
		
		int e = c % a; 		//	a=6 b=10 c=16 d=2 e=4
		
		int f = e++;		//	a=6 b=10 c=16 d=2 e=4(5) f=4
							//	a=6 b=10 c=16 d=2 e=5 f=4
		
		int g = (--b) + (d--);	// a=6 b=10 c=16 d=2(1) e=5 f=4 g=11
								// a=6 b=10 c=16 d=1 e=5 f=4 g=11
		int h = 2;
		
		// a=6 b=10 c=16 d=1 e=5 f=4 g=11 h=2
		int i = a++ +b / (--c / f) * (g-- - d) % (++e + h);
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		
	}
	
}
