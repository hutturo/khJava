package com.kh.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+, -, *, /, %) : ");
		char ch = sc.nextLine().charAt(0);
		
		if (num1 > 0 && num2 > 0) { // 1_1. ����ڰ� �Է��� �� ���� ��� ����� ��� => �ǿ����ڵ��� �� �Է����� ���
			
			// 2. �����ȣ�� ���Ŀ� ���� ��������� ��� ���
			//    "xx x xx = ���"
			
			int result = 0;
			
			switch (ch) {
			
			case '+': 
				result = num1 + num2;
				break;
			case '-': 
				result = num1 - num2;
				break;
			case '*': 
				result = num1 * num2;
				break;
			case '/': 
				result = num1 / num2;
				break;
			case '%': 
				result = num1 % num2;
				break;
			default:	// �������� ����� �� �Է������� �����ȣ�� �߸� �Է��� ���
				System.out.println("�����ȣ�� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");	
				return;
			}
			
			System.out.printf("%d %c %d = %d", num1, ch, num2, result);
			
		} else { // 1_2. �װ� �ƴ� ���(num1�� ����� �ƴϰų�, num2�� ����� �ƴϰų�, �� �� ����� �ƴϰų�)

			System.out.println("�ǿ����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			
		}
		
	}
	
	public void practice0() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int midTerm = sc.nextInt();
		
		System.out.print("�⸻ ��� ���� : ");
		int finalTerm = sc.nextInt();
		
		System.out.print("���� ��� ���� : ");
		int homework = sc.nextInt();
		
		System.out.print("�⼮ ��� ���� : ");
		int attendance = sc.nextInt();
		
		// �� 100������ ȯ��
		// �߰���� ���� (20%)		=> 100��		=> 20��
		// �⸻��� ���� (30%)		=> 100��		=> 30��
		// ����      ���� (30%)		=> 100��		=> 30��
		// �⼮      ���� (20%)		=> 20ȸ		=> 20��
		
		double mid = midTerm * 0.2;
		double fin = finalTerm * 0.3;
		double hw = homework * 0.3;
		double att = attendance;
		
		double sum = mid + fin + hw + att;	// ���� 100�� ���� �������� ����
		
		System.out.println("========== ��� ==========");
		
		if (sum >= 70 && att >= 20 * 0.7) { // Pass�� ��� (������ 70�� �̻��̸鼭 �⼮Ƚ�� ���� 70% �̻��� ���)
			
			System.out.println("�߰� ��� ����(20) : " + mid);
			System.out.println("�⸻ ��� ����(30) : " + fin);
			System.out.println("���� ����(30) : " + hw);
			System.out.println("�⼮ ����(20) : " + att);
			System.out.println("���� : " + sum);
			System.out.println("PASS");
			
		} else { // Fail�� ��� (���� �̴��̰ų�, �⼮Ƚ�� �����̰ų�, �� �� ������ ����...)
			
			// 80�� �̻�, �⼮Ƚ�� ����
			// 60�� (�����̴�), �⼮Ƚ�� 20
			// 60��, 10ȸ
			
			if (sum < 70) {
				System.out.println("FAIL [���� �̴�] (���� " + sum + ")"); // ������ �̴޵Ǿ��� ���
			}
			
			if (att < 20 * 0.7) {
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendance + "/20)"); // �⼮Ƚ���� ������ ���
			}
			
			// �� �� ������ ���
//			System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
//			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendance + "/20)");
			
		}
		
	}
	
}
