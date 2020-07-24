package com.kh.chap04_assit.part01_buffered.model.dao;

import java.io.*;

public class BufferedTest {

    // ���α׷� --> ���� (���)
    public void fileSave() {

        // 1. ��ݽ�Ʈ�� ���� ���� (� "�ܺθ�ü"�� �����͸� �ְ���� ������ �������ִ� ��� ��Ʈ�� ��ü ��������!!)
//        FileWriter fw = new FileWriter("c_buffer.dat");

        // ������Ʈ�� ���� (�ش� ��ݽ�Ʈ����ü�� ���� ä�� ����)
//        BufferedWriter bw = new BufferedWriter(fw);

        // ���� ������ ���ٷ� �ٿ�����!
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"))) {

            // ������ ��� : write()
            bw.write("�ȳ��ϼ���\n");
            bw.write("�ݰ����ϴ�.");
            // ���۶�� ������ ��� �״ٰ� �ѹ��� ��� ��Ŵ --> �ӵ� ��� ����.

            bw.newLine();   // ��ݽ�Ʈ������ �������� �ʴ� �޼ҵ嵵 ����
            bw.write("����������.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fileRead() {

        // BufferedReader ��ü ����
        try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"))) {

            /*
            System.out.println(br.readLine());  // �� �� ������ �о����
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            // ������ ���� ������ ���� null�� ��ȯ
            */

            /*
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
            */

            String value = null;
            while ((value = br.readLine()) != null) {
                System.out.println(value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
