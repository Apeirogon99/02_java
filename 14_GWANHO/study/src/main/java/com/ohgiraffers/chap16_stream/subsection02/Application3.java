package com.ohgiraffers.chap16_stream.subsection02;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {
    /**
     * Stream<R> flatMap(Function<? super T, <? extends R>> mapper)
     * flatMap : 중첩 구조를 한 단계적으로 하고 단일 컬렉션으로 만들어준다
     * 이러한 작업을 프래트닝이라고 한다
     */

    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")
        );

        System.out.println(list);

        List<String> flatList =
                list.stream()
                        .flatMap(Collection::stream)
                        .toList();
        System.out.println(flatList);

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Stream API",
                "flatMap Example"
        );
        System.out.println("sentences: " + sentences);

        List<String> words =
                sentences.stream()
                        .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                        .map(sentence -> sentence.toLowerCase())
                        .toList();
        System.out.println("words: " + words);


        List<String> flatlist = new ArrayList<>();
        List<String> unmodifableList = Collections.unmodifiableList(flatlist);
        System.out.println("unmodifableList: " + unmodifableList);
        List<String> umodifableList = List.of("Java", "SPRING", "SPRINGBOOT");
        List<String> unmodifableList2 = Stream.of("Java", "SPRING", "SPRINGBOOT").toList();
    }
}
