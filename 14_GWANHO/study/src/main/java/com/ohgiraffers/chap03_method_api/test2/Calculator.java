package com.ohgiraffers.chap03_method_api.test2;

public class Calculator {

    public static int minNumberOf(int first, int second) {

        return (first > second)? second : first;
    }

    public static int maxNumberOf(int first, int second) {

        return (first > second)? first : second;
    }
}
