package com.ohgiraffers.chap03_method_api;

public class chap04_random {
    public static void main(String[] args) {

        // 0 ~ 9
        int random1 = (int)(Math.random() * 100) + 0;
        System.out.println(random1);

        // 1 ~ 10
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println(random2);

        // 10 ~ 15
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println(random3);

        // -128 ~ 127
        int random4 = (int)(Math.random() * 255) - 128;
        System.out.println(random4);
    }
}
