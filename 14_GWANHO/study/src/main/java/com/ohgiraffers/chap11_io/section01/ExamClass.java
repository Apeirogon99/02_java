package com.ohgiraffers.chap11_io.section01;

import java.io.File;
import java.time.LocalDate;

public class ExamClass {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        String path = "src/chap11_io/section01/" + now.toString() + ".txt";
        File file = new File(path);
    }
}
