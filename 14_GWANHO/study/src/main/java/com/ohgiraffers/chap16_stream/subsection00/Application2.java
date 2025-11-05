package com.ohgiraffers.chap16_stream.subsection00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("java", "mariadb", "html", "css")
        );

        // stream X
        for(String s : list) {
            print(s);
        }

        // stream O
        list.stream().forEach(Application2::print);

        // parallel stream
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);
    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }

}
