package com.ohgiraffers.chap16_stream.subsection02;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /**
         * Stream<R> map(Function<? super T, ? extends R> mapper);
         * 스트림에 들어있는 데이터를 특정 람다식을 통해
         * 데이터를 가공하고 새로운 스트림에 담아주는 역할
         */

        IntStream intStream = IntStream.range(1, 10);

        IntStream newStream =
                intStream
                        .filter(i -> i % 2 == 0)
                        .map(i -> i * 5);

        newStream.forEach(System.out::println);
    }
}
