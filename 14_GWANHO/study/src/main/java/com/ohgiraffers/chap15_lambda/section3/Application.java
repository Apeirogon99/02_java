package com.ohgiraffers.chap15_lambda.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {
    /**
     * [메소드 참조 표현식]
     * 클래스 이름::메소드 이름
     * 참조 변수 이름::메소드 이름
     */

    public static void main(String[] args) {
        BiFunction<String, String, Boolean> biFunction;
        String str1 = "METHOD";
        String str2 = "METHOD";

        biFunction = (x, y) -> x.equals(y);
        boolean result = biFunction.apply(str1, str2);
        System.out.println("result = " + result);

        Predicate<String> isEqualsToSample;
        String sample = "hello world";

        isEqualsToSample = (x) -> x.equals(sample);
        result = isEqualsToSample.test(sample);
        System.out.println("result = " + result);

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mariadb");
        subjects.add("jdbc");
        subjects.add("mysql");

        forEach(subjects, System.out::println);

    }

    private static void forEach(List<? extends Object> subjects, Consumer<Object> action) {
        for (Object subject : subjects) {
            action.accept(subject);
        }
    }


}
