package com.ohgiraffers.chap13_collection.section01.set;

import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("ab");
        tSet.add("de");
        tSet.add("ab");
        tSet.add("cd");
        tSet.add("ef");
        tSet.add("bc");

        // 디폴트 오름차순
        System.out.println(tSet);
    }
}
