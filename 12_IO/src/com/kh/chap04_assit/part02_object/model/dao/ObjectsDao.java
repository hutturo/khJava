package com.kh.chap04_assit.part02_object.model.dao;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectsDao {

    // ���α׷� --> ����  (���)
    public void fileSave() {

        Phone[] arr = new Phone[3];
        arr[0] = new Phone("������", "����", 1000000);
        arr[1] = new Phone("������", "�Ｚ", 1300000);
        arr[2] = new Phone("������", "����", 1500000);

        // ��ü ������ ���Ͽ� ��½� ���Ǵ� ��Ʈ�� Ŭ����
        // ObjectOutputStream : ��ü ������ ��°����� ���� ����Ʈ ��Ʈ��
        // FileOutputStream   : ���ϰ� ���������� ������ �� ������ ��°����� ��� ����Ʈ ��Ʈ��

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.dat"))) {

            /*
            oos.writeObject(arr[0]);
            oos.writeObject(arr[1]);
            oos.writeObject(arr[2]);
            */

            for (int i = 0; i < arr.length; i++) {
                oos.writeObject(arr[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
