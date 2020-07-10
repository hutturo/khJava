package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {

	public void method2() {
		
		int[] arr = {2, 1, 3}; // �������� : �տ� ���õ� ���� �ڿ� ���õ� ������ �� Ŭ ��� "����"
		
		// arr[0] <--> arr[1]
		
		int temp = arr[0];	// temp = 2;
		arr[0] = arr[1];	// arr[0] = 1;
		arr[1] = temp;	// arr[1] = 1;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method3() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		/*
		 *   ����ü(i)		�񱳴��(j)
		 *   i = 0 �϶�		j = x
		 *   i = 1 �϶�		j = 0~0
		 *   i = 2 �϶�		j = 0~1
		 *   i = 3 �϶�		j = 0~2
		 *   i = 4 �϶�		j = 0~3
		 *   
		 *   i = 0~�������ε���		j = 0~i-1
		 *     �ٱ� for             ���� for
		 */
		
		// �������� ���� : �տ��� �ڿ������� Ŭ ��� => ����!!
		
		System.out.println("=== ���� �� ===");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=== ���� �� ===");
		
		// 1. ����ü�� �����ϴ� for��
		for (int i = 0; i < arr.length; i++) {
			// 2. �񱳴���� �����ϴ� for��
			for (int j = i + 1; j < arr.length; j++) {
				// �� > ��		=> ����
				if (arr[i] > arr[j]) {
					System.out.println("����~!!!");
					// arr[j] <--> arr[i]
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method4() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		// ���������� �������� ����...
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
}
