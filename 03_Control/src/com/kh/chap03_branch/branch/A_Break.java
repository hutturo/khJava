package com.kh.chap03_branch.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 *  * break�� : break���� ����Ǿ��ִ� ���� ����� �ݺ����� ���������� ����
	 *             ��, switch�� ���� break�� switch���� ���������� break
	 *  
	 */
	
	public void method1() {
		
		// ����ڿ��� ���ڿ� �Է¹��� �� �� �Է¹��� ���ڿ� ��� (�� ������ ��� �ݺ�)
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ��� �ݺ��� �����ϰԲ�
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				break;	// �ݺ����� ������ ���������� �ϴ� ����
			}

			System.out.println(str);
			
		}
		
		System.out.println("���α׷� �����մϴ�.");
		
	}
	
	public void method2() {
		
		// �Ź� ������(1~10)�� �߻� ��Ų �� ���
		// ��, �� �������� Ȧ���� ��� �ݺ����� ��������
		
		while (true) {
			int random = (int) (Math.random() * 100 + 1);
			
			System.out.println(random);
			
			if (random % 17 == 0) {
				break;
			}
			
		}
		
	}
	
	public void method3() {
		
		// �Ź� ����ڿ��� ���� �ΰ��� �����ȣ(+�Ǵ�-)�� �Է¹��� ��
		// �� �������� ������ִ� ������ �Ź� ����
		// ��, �����ȣ�� �� �� �Է����� ��� �ݺ����� ����������
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("ù ��° ���� �Է� : ");
			int num1 = sc.nextInt();
			
			System.out.print("�� ��° ���� �Է� : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�����ȣ(+�Ǵ�-) �Է� : ");
			char op = sc.nextLine().charAt(0);
			
			int result = 0;	// ��������� ����� ����� ����
			
			if (op == '+') {
				result = num1 + num2;
			} else if (op == '-') {
				result = num1 - num2;
			} else {
				break;
			}
			
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			
		}

		System.out.println("�߸��Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
		
	}
	
}