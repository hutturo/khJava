package com.kh.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		char ch = sc.nextLine().charAt(0);
		
		if (num1 > 0 && num2 > 0) { // 1_1. 사용자가 입력한 두 정수 모두 양수일 경우 => 피연산자들은 잘 입력했을 경우
			
			// 2. 연산기호가 뭐냐에 따라서 산술연산한 결과 출력
			//    "xx x xx = 결과"
			
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
			default:	// 정수값은 양수로 잘 입력했으나 연산기호를 잘못 입력한 경우
				System.out.println("연산기호를 잘못 입력하셨습니다. 프로그램을 종료합니다.");	
				return;
			}
			
			System.out.printf("%d %c %d = %d", num1, ch, num2, result);
			
		} else { // 1_2. 그게 아닐 경우(num1이 양수가 아니거나, num2가 양수가 아니거나, 둘 다 양수가 아니거나)

			System.out.println("피연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
			
		}
		
	}
	
	public void practice0() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midTerm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();
		
		System.out.print("과제 고사 점수 : ");
		int homework = sc.nextInt();
		
		System.out.print("출석 고사 점수 : ");
		int attendance = sc.nextInt();
		
		// 총 100점으로 환산
		// 중간고사 점수 (20%)		=> 100점		=> 20점
		// 기말고사 점수 (30%)		=> 100점		=> 30점
		// 과제      점수 (30%)		=> 100점		=> 30점
		// 출석      점수 (20%)		=> 20회		=> 20점
		
		double mid = midTerm * 0.2;
		double fin = finalTerm * 0.3;
		double hw = homework * 0.3;
		double att = attendance;
		
		double sum = mid + fin + hw + att;	// 도합 100점 만점 기준으로 총점
		
		System.out.println("========== 결과 ==========");
		
		if (sum >= 70 && att >= 20 * 0.7) { // Pass일 경우 (총점이 70점 이상이면서 출석횟수 또한 70% 이상일 경우)
			
			System.out.println("중간 고사 점수(20) : " + mid);
			System.out.println("기말 고사 점수(30) : " + fin);
			System.out.println("과제 점수(30) : " + hw);
			System.out.println("출석 점수(20) : " + att);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
			
		} else { // Fail일 경우 (총점 미달이거나, 출석횟수 부족이거나, 둘 다 부족일 수도...)
			
			// 80점 이상, 출석횟수 부족
			// 60점 (점수미달), 출석횟수 20
			// 60점, 10회
			
			if (sum < 70) {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")"); // 점수만 미달되었을 경우
			}
			
			if (att < 20 * 0.7) {
				System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)"); // 출석횟수만 부족할 경우
			}
			
			// 둘 다 부족할 경우
//			System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
//			System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)");
			
		}
		
	}
	
}
