package com.ohgiraffers.chap13_collection.section01.List.run;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Application2 {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("burrito");
        set.add("friedEgg");
        set.add("kimchi");
        set.add("friedEgg");

        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
