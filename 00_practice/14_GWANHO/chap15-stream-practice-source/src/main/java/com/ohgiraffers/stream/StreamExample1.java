package com.ohgiraffers.stream;

import java.util.List;

public class StreamExample1 {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Franklin");

        names.stream()
                .filter(name -> name.length() >= 5)
                .map((name) -> name.toUpperCase())
                .forEach(System.out::println);


// 출력값
// ALICE
// CHARLIE
// DAVID
// FRANKLIN
    }
}
