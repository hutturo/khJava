package com.kh.chap03_branch.branch;

public class B_Continue {
	
	/*
	 *  continue : continue;�� ������ �Ǹ� �� �ڿ� �������� �������� �ʰ�
	 *             ���� ����� �ݺ��� ���� �ö󰡶�� �ǹ�
	 */
	
	public void method1() {
		// 1���� 10������ Ȧ�� ���
		// 1 3 5 7 9
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 == 0) { // ¦���� ���	=> ���� ���� �������� ���� �ٽ� �ݺ��� ���� �ö󰡶�!
				continue;
			}
			
			System.out.print(i + " ");
			
		}
		
	}
	
	public void method2() {
		
		// 1���� 100���� �������� �հ�
		// ��, 6�� ������� ���� ���������ض�
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 6 == 0) {
				continue;
			}
			
			sum += i;
		}
		
		System.out.println(sum);
		
	}
	
	public void method3() {
		
		// 2~9�� ������ ������ ���
		// ��, 4�� ������� ���� ��� (4��, 8�� ����)
		
		// �� : 2~9 1�� ����			=> �ٱ��� for��
		// �� : �� �ܸ��� 1~9 1�� ����		=> ���� for��
		
		for (int dan = 2; dan <= 9; dan++) {
			
			if (dan % 4 == 0) {
				continue;
			}
			
			System.out.println("=== " + dan + "�� ===");
			
			for (int num = 1; num <= 9; num++) {
				
				if (num % 2 == 0) {
					continue;
				}
				
				System.out.println(dan + " x " + num + " = " + dan * num);
			
			}
			
			System.out.println();
		
		}
		
	}
	
}