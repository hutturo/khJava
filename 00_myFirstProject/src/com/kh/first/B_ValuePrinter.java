package com.kh.first;

public class B_ValuePrinter { // com.kh.first.B_ValuePrinter

	/*
	 *  ** ��Ģ **
	 *  1. Ŭ������ --> �빮�ڷ� ����
	 *  2. ��Ű���� --> �ҹ��ڷ� ����
	 *  3. �޼ҵ�� --> �ҹ��ڷ� ����
	 *  4. ������    --> �ҹ��ڷ� ����
	 *  
	 *  ��, �������� �ܾ ���� ���� �ܾ� ���ڸ����� �빮�ڷ�!! == ��Ÿǥ���(�����ڰ��� ����)
	 *  
	 *  ex) Ŭ������ Methodprinter		=> MehodPrinter
	 *  	�޼ҵ�� printvalue			=> printValue
	 *  
	 *  �׸��� �׻� �ǹ��ְ� �̸� ����!!
	 */
	
	// �پ��� ������ ������ ����ϴ� ����� �޼ҵ�
	public void printValue() {
		
		// 1. ���� ���		--> ����ǥ ����
		System.out.println(123);	// ������ ���
		System.out.println(1.23);	// �Ǽ��� ���
	}
	
}
