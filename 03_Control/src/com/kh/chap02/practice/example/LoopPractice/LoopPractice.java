package com.kh.chap02.practice.example.LoopPractice;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class LoopPractice {
	
	public void pracitce1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			
			for (int i = 1; i < num + 1; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void practice2() {
		
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int k = num;
		
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.print(k + " ");
				k--;
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
			
	}
	
	public void practice4() {
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			sum += i;			
			if (i != num) {
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = " + sum);
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		if (num1 < 1 && num2 < 1) {
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		}
		
	}
	
	public void practice7() {
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println("==== " + num + "�� ====");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if (num >=2 && num <= 9) {
			for (int i = num; i < 10; i++) {
				System.out.println("\n===== " + i + "�� =====");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}					
		} else {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
		
	}
	
	public void practice10() {
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int startNum = sc.nextInt();
		System.out.print("���� : ");
		int count = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(startNum + " ");
			startNum += count;
		}
		
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			
			// 1. ������ �Է¹ޱ�
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.next();
			
			if (op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.\n");
				break;
			}
			
			// 2. �ΰ��� ������ �Է¹ޱ�
			System.out.print("���� 1 : ");
			int num1 = sc.nextInt();
			System.out.print("���� 2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			//	>> ����ó�� : �����ڰ� '/'�̸鼭(�׸���) num2�� 0�� ��� �������� ��� �� �ݺ��� ���� �ö󰡴�!!
			if (op.equals("/") || op.equals("%") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
				continue;
			}
			
			// 3. ���� ��� ������ֱ�
			int result = 0; // ������� ��� ����
			
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			// >> ����ó�� : �����ڸ� �߸��Է����� ��� �������� ��� �� �ݺ��� ���� �ö󰡴�!
			default:
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n");
				continue;
			}
			
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
		}
		
	}
	
}
