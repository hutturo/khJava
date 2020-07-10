package com.kh.chap02_loop.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * * for��
	 * 
	 * for(�ʱ��; ���ǽ�; ������) { // �ݺ� Ƚ���� �����ϱ� ���� �����ϴ� �͵�
	 * 		.. �ݺ������� �����Ű�����ϴ� ���౸�� ..
	 * }
	 * 
	 * for���� ������ ����
	 * �ʱ�� --> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--> ���ǽ� �˻� --> true�� ��� ���౸�� ���� --> ������
	 * 		--> �ٽ� ���ǽ� --> true�� ��� ���౸�� ���� --> ������
	 * 		---------------- �� ������ ��� �ݺ� --------------
	 * 		--> �ٽ� ���ǽ� --> false�� ��� ���౸�� ����X --------> �ݺ���������
	 * 
	 * 
	 * - �ʱ�� : �ݺ����� ����� �� "�� �ѹ��� ����Ǵ� ����"
	 * 			(�ַ� ���� ����� ���ÿ� �ʱ�ȭ ����)
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� true�� ��� �ش� ���� ������ ����
	 * 			���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ��������
	 * 			(�ַ� �ʱ�Ŀ��� ���� ������ ������ ���ǽ��� �ۼ�)
	 * 
	 * - ������ : �ݺ����� �����ϴ� �������� ������Ű�� �κ�
	 * 			(�ַ� �ʱ�Ŀ� ������ ������ ������ ����������(++, --)�� ���)
	 * 
	 */
	
	public void method1() {
		// "�ȳ��ϼ���"�� 5�� �ݺ��ؼ� ���
		/*
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		*/
		// 100���ϰ�� ��¹� 100�� ����? --> ����
	
		for(int i=1; i<=5; i++) { // 1�������� 5���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("�ȳ��ϼ���");
		}
		
		for(int i=0; i<=4; i++) { // 0�������� 4���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("�ݰ����ϴ�");
		}
		
		for(int i=1; i<6; i++) {  // 1�������� 5���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("�ٽø�����");
		}
		
		for(int i=5; i>=1; i--) { // 5�������� 1���� 1�� �����ϴµ��� �ݺ� (5ȸ)
			System.out.println("��ο�");
		}
		
		// 10ȸ
		//for(int i=1; i<=10; i++) { // 1�������� 10���� 1�� �����ϴµ��� �ݺ� (10ȸ)
		for(int i=11; i<=20; i++) {	
		
		}
		
		
		// �ʱⰪ�������� �ش� ������ true�϶����� 1�� �����ϴµ��� �ݺ� ����!!
		
		// i=1  i<=5  true  ���   i++
		// i=2  i<=5  true  ���   i++
		// i=3  i<=5  true  ���   i++
		// i=4  i<=5  true  ���   i++
		// i=5  i<=5  true  ���   i++
		// i=6  i<=5  false ----------> �ݺ����� ��������
	}
	
	public void method2() {
		// 1���� 5���� ���
		// 1
		// 2
		// 3
		// 4
		// 5
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		// �ݺ����� ���õ� �������� �̿��� ���� ����
		for(int i=1; i<=5; i++) { // 1�������� 5���� 1�������ϴµ��� �ݺ� (5ȸ)
			System.out.println(i);
		}
		
		// 1 2 3 4 5
		for(int i=1; i<6; i++) { // 1�������� 5���� 1�������ϴµ��� �ݺ� (5ȸ)
			System.out.print(i + " ");
		}
		
	}

	public void method3() {
		// 5 4 3 2 1
		for(int i=5; i>=1; i--) { // 5�������� 1���� 1�������ϴµ��� �ݺ� (5ȸ)
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 0 1 2 3 4 5 6 7 8 9 
		// 1 2 3 4 ..... 8 9 10
		
		for(int i=0; i<=9; i++) { // 0�������� 9���� 1�� �����ϴµ��� �ݺ� (10ȸ)
			System.out.print(i + 1 + " ");
		}
		
	}
	
	public void method5() {
		// 1���� 10������ Ȧ������ ���
		// 1 3 5 7 9 
		
		/*
		for(int i=1; i<=10; i++) { // 1�������� 10���� 1�� ���� (10ȸ)
			if(i % 2 == 1) {
				System.out.print(i + " "); // i���� Ȧ���� ��츸 ���
			}
		}
		*/
		
		for(int i=1; i<=10; i+=2) { // 1�������� 10���� 2�������ϴµ��� �ݺ� (5ȸ)
			System.out.print(i + " ");
		}
		
		
	}
	
	public void method6() {
		
		// 1�������� 10������ ���������� �հ�
		// int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		
		// sum += 1;
		// sum += 2;
		// sum += 3;
		// ...
		// sum += 9;
		// sum += 10;
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("�� �հ� : " + sum);
		
	}
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� : ");
		int number = sc.nextInt();
		int sum = 0;
		
		// ����ڰ� �Է��� �������� ������� �ƴ��� (��ȿ�� �� ����� �Է��ߴ��� ��ȿ���˻�)
		if (number > 0) {
			
			// sum += 1;
			// sum += 2;
			// ...
			// sum += number;			
			for (int i = 1; i <= number; i++) {
				sum += i;
			}
			
			// "1�������� xx������ �� �հ� : xx"
			System.out.println("1�������� " + number + "������ �� �հ� : " + sum);
			
		} else { // �װ� �ƴ� ��� => �߸� �Է�
			System.out.println("����� �Է����ּ���.");
		}
		
	}
	
	public void method8() {
		
		// 1�������� � ������(1~10������ ������ ����)������ �հ�
		
		// MathŬ�������� �����ϴ� random() �޼ҵ� ȣ��� => ������ �߻�!
		// java.lang.Math�� �ִ� �޼ҵ� ȣ��� ������ �ʿ����! => Ŭ������.�޼ҵ�();
		// 0.0 ~ 0.999999999999 ������ �������� �߻�!!

//		int random = Math.random();	// double���� int���� ������׷��� �߻��� ����
		//           0.0 <=		< 1.0		--> 0.0 ~ 0.999999999999
		
//		int random = Math.random() * 10;
		//           0.0 <=		< 10.0		--> 0.0 ~ 9.999999999999
		
//		int random = Math.random() * 10 + 1;
		//           1.0 <=		< 11.0		--> 1.0 ~ 10.999999999999
		
		int random = (int)(Math.random() * 10 + 1/*=> ���ۼ�*/);
		//           1 <=		< 11		--> 1 ~ 10
		
		System.out.println("������ : " + random);
		
		// sum += 1;
		// sum += 2;
		// ...
		// sum += random;
		
		int sum = 0;
		
		for (int i = 1; i <= random; i++) { // 1�������� random���� 1�� �����ϴµ��� �ݺ�(randomȸ)
			sum += i;
		}
		
		System.out.println("1���� " + random + "������ �� �հ� : " + sum);
		
	}
	
	public void method9() {
		
		// ����ڿ��� ���ڿ� �Է¹��� ��
		// �� �ε����� ���ڸ� ���� �� ���
		
		// ���� ��� apple�� �Է�
		// a		--> ��¹�(str.charAt(0));
		// p		--> ��¹�(str.charAt(1));
		// p		--> ��¹�(str.charAt(2));
		// l		--> ��¹�(str.charAt(3));
		// e		--> ��¹�(str.charAt(4));
		
	// ����     5        4         10
		// apple	kiwi	strawberry
		// 01234	0123	0123456789
		
		// ������ �ε����� �׻� (���ڿ��� ����-1)�̱���!!!
		
		// �����ϰ��� �ϴ� �ε������� 0~�������ε���(���ڿ��� ����-1)���� 1�� ������!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println("���ڿ��� ���� : " + str.length());
		
		for (int i = 0; i < str.length(); i++) { // 0�������� str.length()-1���� 1�� �����ϴµ��� �ݺ�(���ڿ��� ���� Ƚ��)
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		
		// 2�� ����ϱ�
		
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// ...
		// 2 x 8 = 16
		// 2 x 9 = 18
		
		int num = 0;
		
		for (int i = 0; i < 9; i++) { // 1�������� 9���� 1�� �����ϴµ��� �ݺ�
			++num;
			System.out.println("2 x " + num + " = " + 2 * num);
		}
		
	}
	
	public void method11() {
		// ����ڰ� �Է��� ���� ����ϱ�
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��(2~9)�� �Է����ּ��� : ");
		int dan = sc.nextInt();
		*/
		
		// 2~9������ ������ ���� ���
		
		int dan = (int)(Math.random() * 8 + 2/*=> ���ۼ�*/);
		
		System.out.println(dan);
		
		if (dan >= 2 && dan <= 9) { // ��ȿ�� ���� �Է����� ���
			
			// dan x 1 = ���
			// dan x 2 = ���
			// ...
			// dan x 9 = ���
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
			
		} else { // �߸� �Է����� ���
			System.out.println("�߸��� ���� �Է��߽��ϴ�.");
		}
		
	}
	
	public void method12() {
		
		// ����ڿ��� �� ���� ������ �Է� �޾�
		// �� ���� ������ �� ���������� ū�������� ���� ���
		
		// 2, 4 �Է����� �� --> 2 3 4	�� �հ� : 9
		// 4, 2 �Է����� �� --> 2 3 4	�� �հ� : 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int firstNum = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int secondNum = sc.nextInt();
		
		int min = Math.min(firstNum, secondNum);
		int max = Math.max(firstNum, secondNum);
		
		int sum = 0;
		
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		
		System.out.println();
		System.out.println("�� �հ� : " + sum);
		
	}
	
	/*
	 *  ��ø for��
	 *  
	 *  for (�ʱ��1; ���ǽ�1; ������1;) {
	 *  
	 *  	�����ҹ���1;
	 *  
	 *  	for (�ʱ��2; ���ǽ�2; ������2;) {
	 *  		�����ҹ���2;
	 *  	}
	 *  
	 *  	�����ҹ���3;
	 *  
	 *  }
	 *  
	 */
	
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// ù��° ������ ������ �� 1 2 3 4 5
		// �ι�° ������ ������ �� 1 2 3 4 5
		// ����° ������ ������ �� 1 2 3 4 5
		
		
		// �ٱ��� for������ ���� ����
		// ���� for�� ���� ����
		for (int i = 0; i < 3; i++) { // 1�������� 3���� 1�� �����ϴµ��� �ݺ� (3ȸ)
			for (int j = 1; j <= 5; j++) { // 1�������� 5���� 1�� �����ϴµ��� �ݺ� (5ȸ)
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
			
		}
		
		/*
		 * i = 1 true
		 * 		j = 1 true	1��� j++
		 * 		j = 2 true	2��� j++
		 * 		j = 3 true	3��� j++
		 * 		...
		 * 		j = 5 true	5��� j++
		 * 		j = 6 false			--> ���� �ݺ��� ��������
		 * 		������� i++
		 * 
		 * i = 2 true
		 * 		j = 1 true	1��� j++
		 * 		j = 2 true	2��� j++
		 * 		j = 3 true	3��� j++
		 * 		...
		 * 		j = 5 true	5��� j++
		 * 		j = 6 false			--> ���� �ݺ��� ��������
		 * 		������� i++
		 * 
		 * i = 3 true
		 * 		j = 1 true	1��� j++
		 * 		j = 2 true	2��� j++
		 * 		j = 3 true	3��� j++
		 * 		...
		 * 		j = 5 true	5��� j++
		 * 		j = 6 false			--> ���� �ݺ��� ��������
		 * 		������� i++
		 * 
		 * i = 4 false ---> �ٱ��� �ݺ��� ��������
		 *  
		 */
		
	}
	
	public void method14() {
		
		// 0�� 0�� ~ 23�� 59��
		
		// 0�� 0��
		// 0�� 1��
		// ...
		// 0�� 58��
		// 0�� 59��
		
		// 1�� 0��
		// 1�� 1��
		// ...
		// 1�� 58��
		// 1�� 59��
		
		// ...
		
		// 23�� 0��
		// 23�� 1��
		// ...
		// 23�� 58��
		// 23�� 59��
		
		// �ð��� 0~23�ñ��� 1�� ������
		// �� �ð� �ϳ� ������ 0~59�б��� 1�� ������
		
		// �� --> 0���� 23���� 1�� ����			--> �ٱ��� for������ �ذ�
		// �� --> �� �ø��� 0���� 59�б��� 1�� ����	--> ���� for������ �ذ�
		
		for (int hour = 0; hour < 24; hour++) {
			
			System.out.println("=== " + hour + "�� ===");
			
			for (int minute = 0; minute < 60; minute++) {
				
				System.out.println(hour + "�� " + minute + "��");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public void method15() {
		// 2�ܺ��� 9�ܱ���
		
		// === 2�� ===
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
		
		// === 3�� ===
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 9 = 27

		// ......
		
		// === 9�� ===
		// 9 x 1 = 9
		// 9 x 2 = 18
		// ...
		// 9 x 9 = 81
		
		// �� ---> 2�������� 9���� 1�� ����			=> �ٱ��� for��
		// �� ---> �� �ܸ��� 1���� 9���� 1�� ����		=> ���� for��
		
		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 0) {
				System.out.println("=== " + dan + "�� ===");
				for (int num = 1; num <= 9; num++) {
					System.out.println(dan + " x " + num + " = " + dan * num);
				}
				System.out.println();
			}
		}
		
	}
	
	public void method16() {
		
		// *****
		// *****
		// *****
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method17() {
		//   1234
		// 1 ****
		// 2 ****
		// 3 ****
		// 4 ****
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(i + 1);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
}