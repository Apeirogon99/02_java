package com.ohgiraffers.chap01_variable;

public class chap02_variable {
    public static void main(String[] args) {
        System.out.println("A : " + (10 + 10));

        byte b = 0b1111;
        int c = Byte.toUnsignedInt(b);
        System.out.println(c);
    }
}