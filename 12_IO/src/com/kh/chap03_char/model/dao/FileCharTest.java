package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {

    // ���α׷� --> ���� (Ǯ�� : ���α׷��� �����͸� ���Ϸ� �������ڴ�.)
    public void fileSave() {

        // FIleWriter : ���Ϸ� �����͸� 2����Ʈ ������ ����ϱ�

        // 1. FileWriter ��ü ����

        // �ش� ��Ʈ�� �� �� �� �ڵ����� close()���� ���ִ� ����
        // try with resource ����
        /*
        try (��Ʈ�� ��ü �����ϴ� ����) {

        } catch (����Ŭ������ e) {

        }
         */

        try (FileWriter fw = new FileWriter("b_char.txt")) {

            // 2. ��η� ������ ��� : write() �޼ҵ� �̿�
            fw.write('A');
            fw.write(' ');
            fw.write("��!IO ��մ�...");
            fw.write("\n");

            // char[] �迭 ���۰���
            char[] cArr = {'a', 'p', 'p', 'l', 'e'};
            fw.write(cArr);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // ���α׷�<-- ���� (�Է� : ���Ϸκ��� ���α׷����� ������ ��������)
    public void fileRead() {

        // FIleReader : ���Ϸ� �����͸� 2����Ʈ ������ �Է¹ޱ�

        // 1. FileReader ��ü ����
        try (FileReader fr = new FileReader("b_char.txt")) {

            // 2. ��θ� ���ؼ� ������ �Է¹޾ƿ��� : read() �޼ҵ�
            /*
            System.out.println(fr.read());
            System.out.println(fr.read());
            System.out.println(fr.read());
            System.out.println(fr.read());
            System.out.println(fr.read());
            */
            // �굵 ���������� ������ ���� ������ -1�� ��ȯ

            int value = 0;
            while ((value = fr.read()) != -1) {
                System.out.println(value + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
