package com.ohgiraffers.chap15_lambda.section2.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {

        /* Function<T, R>#apply(T t):R ===> 객체 T를 R로 매핑 */
        Function<String, Integer> function = (String str) -> Integer.parseInt(str);
        String value = "12345";
        System.out.println(function.apply(value) + " : " + function.apply(value).getClass().getName());

        /* BiFunction<T, U, R>#apply(T t, U u):R ==> 객체 T와 U를 R로 매핑한다 */
        BiFunction<String, String, Integer>  biFunction = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(biFunction.apply("1234", "5678"));
    }
}
