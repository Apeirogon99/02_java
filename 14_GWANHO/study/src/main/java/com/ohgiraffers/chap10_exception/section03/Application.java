package com.ohgiraffers.chap10_exception.section03;

import java.io.*;

public class Application {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException | EOFException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            System.out.println("finally");
        }
    }
}
