package com.ohgiraffers.chap15_lambda.section2.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {

        /* BinaryOperator<T>#apply(T t1, T t2):T ==> T와 T를 연산하여 T를 리턴한다 */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("1234", "5678"));

        /* UnaryOperator<T>#apply(T t):T ===> T를 연산하여 T를 리턴한다 */
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hello "));
    }
}
