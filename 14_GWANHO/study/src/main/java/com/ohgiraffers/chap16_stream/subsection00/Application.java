package com.ohgiraffers.chap16_stream.subsection00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("stream");
        list.add("world");

        // 기존 방법
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals("stream")) {
                System.out.println(next);
            }
        }

        // Steam 활용
        list.stream().forEach(str -> System.out.println("걸러진 값 : " + str));
    }
}
