package com.ohgiraffers.chap16_stream.subsection03;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    /*
     * match
     * boolean anyMatch(Predicate<? super T> predicate);      // 하나라도 조건을 만족하는 값이 있는지
     * boolean allMatch(Predicate<? super T> predicate);      // 모든 조건을 만족하는지
     * boolean noneMatch(Predicate<? super T> predicate);     // 모든 조건을 만족하지 않는지
     * */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "SpringBoot");

        boolean anyMatch = list.stream().anyMatch(s -> s.contains("p"));  // 하나라도 조건을 만족한다면
        boolean allMatch = list.stream().allMatch(s -> s.length() >= 4); // 모든 조건을 만족하는지
        boolean noneMatch = list.stream().noneMatch(s -> s.contains("a")); // 모든 조건을 만족하지 않는지

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);

    }
}
