package com.kh.chap02_byte.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	// ���α׷� (�ڹ� �ڵ�) --> �ܺθ�ü(����) (���)
	public void fileSave() {
		
		// FileOutputStream  : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		try {
			// 1. FileOutputStream ��ü ���� : �ش� ���ϰ��� ������ΰ� �������
			FileOutputStream fos = new FileOutputStream("a_byte.txt"); // fos�� �ٷ� ���� ���
			
			// 2. ��η� ������ ��� : write() �޼ҵ� ���
			//    ��, 1����Ʈ ������ �ۿ� ������ ��� �Ұ�
			fos.write(97); // ���ڰ� �״�� ����Ǵ°� �ƴ� �ش� ������ �ƽ�Ű�ڵ�(0~127)���� ���ڰ� �����
			fos.write('b');
			fos.write('��'); // �ѱ��� 2byte¥���̱� ������ 1byte��η� ���޽� ������ ��ϵ�!! 
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
