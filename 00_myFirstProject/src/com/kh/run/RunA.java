package com.kh.run;

import com.kh.first.*;

public class RunA {

	public static void main(String[] args) {
		
		System.out.println("���α׷�����!!");
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 �����ϰ��� �� ��
		
		// 1) ������ �޼ҵ尡 �ִ� Ŭ������ ����()
		// [ǥ����] Ŭ������ ������̸�  = new Ŭ������();
		//A_MethodPrinter amp = new A_MethodPrinter();	
		// => �ڵ带 ����ϰ� �ִ� RunA Ŭ������ �����ִ� ��Ű���� �ش� Ŭ������ ���� ������ 
		//	    ���� ��Ű�� ���� �ش� Ŭ������ ã�� �� ���� ������ ����!!
		
		// �ذ���1. �����ϰ��� �ϴ� Ŭ������ � ��Ű���� �����ִ��� Ǯ Ŭ�������� �����ϴ� ���
		//com.kh.first.A_MethodPrinter amp = new com.kh.first.A_MethodPrinter();
		
		// �ذ���2. Ŭ�������� ������ ������ �ϵ� �� Ŭ������ ��� ��Ű���� ���� �ִ��� �� �ѹ� ����(import)�� �ִ� ���
		A_MethodPrinter amp = new A_MethodPrinter();
		
		// 2) �޼ҵ� ����(ȣ��)
		// [ǥ����] ������̸�.�����Ҹ޼ҵ��();
		amp.methodA();
		//amp.methodB();
		//amp.methodC();
		
	}

}
