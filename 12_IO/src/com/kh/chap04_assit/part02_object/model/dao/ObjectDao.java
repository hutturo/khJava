package com.kh.chap04_assit.part02_object.model.dao;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

public class ObjectDao {

    // 프로그램 --> 파일 (출력)
    public void fileSave() {

        // 파일에 기록할 Phone 객체 생성
        Phone ph = new Phone("갤럭시", "삼성", 1500000);

    }

    // 프로그램 <-- 파일 (입력)
    public void fileRead() {



    }

}
