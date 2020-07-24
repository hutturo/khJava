package com.kh.chap04_assit.part02_object.model.dao;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

import java.io.*;

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

    // ���α׷� <-- ���� (�Է�)
    public void fileRead() {

        // ���Ͽ� ��ϵ� �����͸� ��ü������ �Է¹޾ƿ� �� �ʿ��� ��Ʈ��
        // ObjectInputStream : ��ü������ �Է¹��� �� �ִ� ���� ����Ʈ ��Ʈ��
        // FileInputStream   : ���ϰ� ���������� �����ؼ� ������ �Է� ���� �� �ִ� ��� ����Ʈ ��Ʈ��

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.dat"))) {

            /*
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
            */

            // ������ ���� ������ ��
            // read() : -1�� ��ȯ
            // readLine() : null ��ȯ
            // readObject() : EOFException  (EOF : End Of File)

            while (true) {
                System.out.println(ois.readObject());
            }

        } catch (EOFException e) {
            System.out.println("������ �� �о����ϴ�.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
