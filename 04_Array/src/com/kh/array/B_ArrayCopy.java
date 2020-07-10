package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 *  * �迭�� ����
	 *  - ���� ���� : �迭�� �ּҸ��� ����
	 *  - ���� ���� : �迭�� ������ �����ϰ� ���� ���� ������ ����
	 */

	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("=== ���� �迭 ===");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		int[] copy = origin;
		System.out.println("\n=== ���纻 �迭 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99; // ���纻 �迭 ������ ����
		
		System.out.println("\n--------------- ���纻 �迭 ���� �� -------------------");

		System.out.println("=== ���� �迭 ===");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n=== ���纻 �迭 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
		// ���Ұ����� ����(��������)���� �� ���� �迭�� �����ϰ� ����
		
	}
	
	// ���� ����	
	public void method2() {
		// 1. for�� ���
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[origin.length];
		
		System.out.println("== ���纻 �迭 ==");
		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
			System.out.println(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n---------- ���纻 ������ ------------");
		System.out.println("=== ���� �迭 ===");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n=== ���纻 �迭 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());		
		
	}
	
	public void method3() {
		// 2. ���ο� �迭 �����ϰ� SystemŬ���������� arraycopy �޼ҵ带 �̿��� ����
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int [10]; // �˳��ϰ� ũ�� ����
		
//		System.arraycopy(�����迭��, ���縦 ������ �ε���, ���纻�迭��, ���纻�迭�� ���簡 ���۵� �����ε���, �����Ұ���);		
		System.arraycopy(origin, 0, copy, 2, 5);
		
		// ���纻 �迭 ���
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("orgin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		
		// �ּҰ� �ٸ� => �迭 ���� �� ���� ������ ���� ����!
		
	}
	
	public void method4() {
		// 3. Arrays Ŭ����
		int[] origin = {1, 2, 3, 4, 5};

		// ���纻 �迭 = Arrays.copyOf(�����迭��, �����Ұ���); => copy�迭�� ũ�� == ������ ����
//		int[] copy = Arrays.copyOf(origin, origin.length);
		
		int[] copy = Arrays.copyOf(origin, 3);
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// ArraysŬ���������� copyOf �޼ҵ�� SystemŬ���������� arraycopy�� ������
		// ������ �����ε���, ����� �����ε��� ���ô� �Ұ�!!
		
		System.out.println();
		System.out.println("orgin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		
	}
	
	public void method5() {
		// 4. clone() �޼ҵ� �̿��� ���� (�����ε���, �����Ұ��� ��ü ���úҰ�)
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		/*
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		*/
		
		System.out.println(Arrays.toString(copy));
		
		System.out.println("\norgin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
	
	}
	
}