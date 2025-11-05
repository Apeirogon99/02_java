package com.ohgiraffers.chap16_stream.subsection03;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {

        System.out.println(IntStream.range(1, 10).count());
        System.out.println(IntStream.range(1, 10).max());
        System.out.println(IntStream.range(1, 10).min());
        System.out.println(IntStream.range(1, 10).sum());

        System.out.println(IntStream.range(1, 10).filter(i -> i % 2 == 1).sum());
    }
}
