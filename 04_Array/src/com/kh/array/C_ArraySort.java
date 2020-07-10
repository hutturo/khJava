package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {

	public void method2() {
		
		int[] arr = {2, 1, 3}; // 오름차순 : 앞에 제시된 값이 뒤에 제시된 값보다 더 클 경우 "변경"
		
		// arr[0] <--> arr[1]
		
		int temp = arr[0];	// temp = 2;
		arr[0] = arr[1];	// arr[0] = 1;
		arr[1] = temp;	// arr[1] = 1;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void method3() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		/*
		 *   비교주체(i)		비교대상(j)
		 *   i = 0 일때		j = x
		 *   i = 1 일때		j = 0~0
		 *   i = 2 일때		j = 0~1
		 *   i = 3 일때		j = 0~2
		 *   i = 4 일때		j = 0~3
		 *   
		 *   i = 0~마지막인덱스		j = 0~i-1
		 *     바깥 for             안쪽 for
		 */
		
		// 오름차순 정렬 : 앞에께 뒤에꺼보다 클 경우 => 변경!!
		
		System.out.println("=== 정렬 전 ===");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=== 정렬 후 ===");
		
		// 1. 비교주체를 선정하는 for문
		for (int i = 0; i < arr.length; i++) {
			// 2. 비교대상을 선정하는 for문
			for (int j = i + 1; j < arr.length; j++) {
				// 앞 > 뒤		=> 변경
				if (arr[i] > arr[j]) {
					System.out.println("변경~!!!");
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
		
		// 내부적으로 오름차순 정렬...
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
}
