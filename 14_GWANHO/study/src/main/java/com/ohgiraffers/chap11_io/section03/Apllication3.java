package com.ohgiraffers.chap11_io.section03;

import java.io.*;

public class Apllication3 {
    public static void main(String[] args) {

        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("src/chap11_io/section03/test.txt");
            fout.write(97);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
