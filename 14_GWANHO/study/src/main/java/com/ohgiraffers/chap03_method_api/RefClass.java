package com.ohgiraffers.chap03_method_api;

public class RefClass {
    private int num;
    private static int num2;
    RefClass(int num) {
        this.num = num;
        this.num2 = num;
    }

    public boolean compareNumber(int value) {
        return num > value;
    }

    public static boolean compareStaticNumber(int value) {
        return num2 > value;
    }

    public int minNumberOf(int first, int second) {

        return (first > second)? second : first;
    }

    public static int maxNumberOf(int first, int second) {

        return (first > second)? first : second;
    }
}
