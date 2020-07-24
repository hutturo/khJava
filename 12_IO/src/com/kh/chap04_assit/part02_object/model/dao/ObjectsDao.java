package com.kh.chap04_assit.part02_object.model.dao;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectsDao {

    // 프로그램 --> 파일  (출력)
    public void fileSave() {

        Phone[] arr = new Phone[3];
        arr[0] = new Phone("벨벳폰", "엘지", 1000000);
        arr[1] = new Phone("갤럭시", "삼성", 1300000);
        arr[2] = new Phone("아이폰", "애플", 1500000);

        // 객체 단위로 파일에 출력시 사용되는 스트림 클래스
        // ObjectOutputStream : 객체 단위로 출력가능한 보조 바이트 스트림
        // FileOutputStream   : 파일과 직접적으로 연결한 후 데이터 출력가능한 기반 바이트 스트림

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
