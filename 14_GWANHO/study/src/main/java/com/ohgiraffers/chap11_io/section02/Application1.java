package com.ohgiraffers.chap11_io.section02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/chap11_io/section02/test.txt");

            int value;
            while ((value = fis.read()) != -1) {
                System.out.println(value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
