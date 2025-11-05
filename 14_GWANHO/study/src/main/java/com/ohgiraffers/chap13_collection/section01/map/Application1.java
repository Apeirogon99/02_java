package com.ohgiraffers.chap13_collection.section01.map;

import java.util.HashMap;

public class Application1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "e");
        map.put(2, "b1");
        map.put(2, "b2");
        map.put(6, "f1");
        map.put(6, "f2");
        map.put(4, "d");
        map.put(3, "c1");
        map.put(3, "c2");
        map.put(7, "g1");
        map.put(7, "g2");
        map.put(1, "a");

        System.out.println(map);

        System.out.println(map.get(2));
    }
}
