package com.ohgiraffers.chap15_lambda.section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        /*

Collection과 람다식 함께 사용*
JDK8에 추가된 default메소드 Iterable:forEach
JDK8에 추가된 default메소드 Collection:removeIf
JDK8에 추가된 default메소드 List:replaceAll
*/

//        test1();
        test2();
    }

    private static void test1() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
//        for(Integer i : list) {
//            System.out.println(i);
//        }

        list.forEach(i -> System.out.println(i + " "));
        System.out.println();
        /* 2의 배수 제거 */
                list.removeIf(i -> i % 2 == 0);
        System.out.println("list = " + list);
        /* 모든 요소에 10 곱하기 */
                list.replaceAll(i -> i * 10);
        System.out.println("list = " + list);

//        list.removeif(i-> i % 2 ==0).replaceAll(i -> i * 10);

    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Devic");
        map.put(2, "Jack");
        map.put(3, "Peter");
        map.put(4, "Brown");
        map.put(5, "Chris");
    }

}
