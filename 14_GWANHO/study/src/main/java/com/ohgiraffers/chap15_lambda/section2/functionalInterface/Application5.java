package com.ohgiraffers.chap15_lambda.section2.functionalInterface;

import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {

        /* Predication<T> */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println(predicate.test("123"));
        System.out.println(predicate.test(123));

        /* Predication<T, U> */
    }
}
