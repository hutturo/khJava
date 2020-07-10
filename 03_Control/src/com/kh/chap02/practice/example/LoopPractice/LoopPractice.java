package com.kh.chap02.practice.example.LoopPractice;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class LoopPractice {
	
	public void pracitce1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			
			for (int i = 1; i < num + 1; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice2() {
		
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int k = num;
		
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.print(k + " ");
				k--;
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
			
	}
	
	public void practice4() {
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
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
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		if (num1 < 1 && num2 < 1) {
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
		
	}
	
	public void practice7() {
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("==== " + num + "단 ====");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num >=2 && num <= 9) {
			for (int i = num; i < 10; i++) {
				System.out.println("\n===== " + i + "단 =====");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}					
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
		
	}
	
	public void practice10() {
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int count = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(startNum + " ");
			startNum += count;
		}
		
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			
			// 1. 연산자 입력받기
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.\n");
				break;
			}
			
			// 2. 두개의 정수값 입력받기
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			//	>> 조건처리 : 연산자가 '/'이면서(그리고) num2가 0일 경우 오류문구 출력 후 반복문 위로 올라가는!!
			if (op.equals("/") || op.equals("%") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue;
			}
			
			// 3. 연산 결과 출력해주기
			int result = 0; // 산술연산 결과 변수
			
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
			// >> 조건처리 : 연산자를 잘못입력했을 경우 오류문구 출력 후 반복문 위로 올라가는!
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
				continue;
			}
			
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
		}
		
	}
	
}
