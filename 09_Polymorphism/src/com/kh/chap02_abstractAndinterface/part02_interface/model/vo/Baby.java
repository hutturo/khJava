package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public class Baby extends Person {
	
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return "Baby[" + super.toString() + "]";
	}
	
	// Baby Ŭ�������� ������ �������̵� �� ��
	// eatȣ��� ������ ���� : ������ 3����, �ǰ��� 1����
	// sleepȣ��� ������ ���� : �ǰ��� 3����

	@Override
	public void eat() {
		
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
		
	}

	@Override
	public void sleep() {
		
		super.setHealth(super.getHealth() + 3);
		
	}
	
}



