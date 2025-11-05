package com.ohgiraffers.chap16_stream.subsection01.generation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        // 배열을 스트림으로 생성
        String[] strs = {"java", "mariadb", "jdbc"};
        Stream<String> stream = Arrays.stream(strs);
        stream.forEach(System.out::println);

        Stream<String> stream1 = Stream.<String>builder()
                .add("java")
                .add("mariadb")
                .add("jdbc")
                .build();
        stream1.forEach(System.out::println);

        /* iterate()를 활용하여 수열 형태의 스트림을 생성 */
        Stream<Integer> stream2 =
                Stream.iterate(10, value -> value * 2).limit(10);
        stream2.forEach(System.out::println);

    }
}
