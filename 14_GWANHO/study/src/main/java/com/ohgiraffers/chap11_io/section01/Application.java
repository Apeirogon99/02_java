package com.ohgiraffers.chap11_io.section01;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        File file = new File("src/chap11_io/section01/test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
