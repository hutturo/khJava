package com.kh.chap02_abstractAndinterface.part02_interface.run;

import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Baby;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Mother;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		
		//Person p;
		
		Person m = new Mother("������", 50, 70, "���");
		Person b = new Baby("��Ʊ�", 3.5, 70);
		
		System.out.println(m);
		System.out.println(b);
		
		// ������ �ƱⰡ ���� �Դ´�.
		m.eat();	// ���� : ������ +10 , �ǰ��� -10
		b.eat();	// �Ʊ� : ������ +3  , �ǰ��� +1
		
		// ������ �ƱⰡ ���� �ܴ�.
		m.sleep();	// ���� : �ǰ��� +10
		b.sleep();	// �Ʊ� : �ǰ��� +3
		
		System.out.println("======= ������ =======");
		System.out.println(m);
		System.out.println(b);
		
		
		
		
	}

}








