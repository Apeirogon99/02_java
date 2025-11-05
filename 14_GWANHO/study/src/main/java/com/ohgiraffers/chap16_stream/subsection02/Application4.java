package com.ohgiraffers.chap16_stream.subsection02;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {

        /**
         * Stream<T> sorted();
         *
         * Stream<T> sorted(Comparator<? super T>) comparator();
         * sorted()은 인자가 없어도 호출이 가능한데
         * 인자가 없으면 오름차순으로 자동정렬
         *
         * 별도의 비교 로직을 구현하고 싶다면
         * comparator를 인자로 넘겨준다
         */

        List<Integer> list = IntStream.of(3, 5, 1, 4, 2)
                .boxed()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println(list);
        list.add(100);
        System.out.println(list);
    }
}
