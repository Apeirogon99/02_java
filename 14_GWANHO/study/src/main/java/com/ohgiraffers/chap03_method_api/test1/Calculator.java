package com.ohgiraffers.chap03_method_api.test1;

public class Calculator {

    public int minNumberOf(int first, int second) {

        return (first > second)? second : first;
    }

    public int maxNumberOf(int first, int second) {

        return (first > second)? first : second;
    }
}
