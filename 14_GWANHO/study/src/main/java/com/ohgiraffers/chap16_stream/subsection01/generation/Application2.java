package com.ohgiraffers.chap16_stream.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {

        /* 기본 자료형 스트림 생성에 대해 이해하고 사용할 수 있다. */
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(i -> System.out.println(i + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(i -> System.out.println(i + " "));
        System.out.println();

        /* Boxing : Wrapper 클래스를 스트림으로 변환 */
        Stream<Double> boxed = new Random().doubles(5).boxed();
        boxed.forEach(i -> System.out.println(i + " "));
        System.out.println();

        /* 문자열을 IntStream으로 변환할 수 있다 */
        IntStream helloworldChars = "hello world".chars();
        helloworldChars.forEach(i -> System.out.println(i + " "));
        System.out.println();

        /* 문자열을 split해서 */
        Stream<String> split = Pattern.compile(", ").splitAsStream("hello, world");
        split.forEach(i -> System.out.println(i + " "));


    }
}
