package com.ohgiraffers.lambda.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */
    private void test1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        Supplier<String> now = () -> formatter.format(java.time.LocalDateTime.now());
        System.out.println(now.get());
    }

    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    private void test2() {
        Supplier<Set<Integer>> lotto = () -> {
            Random r = new Random();
            Set<Integer> set = new TreeSet<>();
            while (set.size() < 6) {
                set.add(r.nextInt(45) + 1);
            }
            return set;
        };

        System.out.println(lotto.get());
    }

    /**
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
     */

    @FunctionalInterface
    interface WonToUsd {
        double convert(int won);
    }

    private void test3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("원화를 입력해주세요");
        int cash = sc.nextInt();

        final double RATE = 1350.0;
        WonToUsd wonToUsd = w -> w / RATE;   // Function 대신 직접 정의한 인터페이스 사용

        double dollar = wonToUsd.convert(cash);
        System.out.println("￦ " + cash + " => ＄ " + dollar);
    }
    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("원화를 입력해주세요");
        int cash = sc.nextInt();

        Function<Integer, Double> wonToUsd = (won) -> {
            final double RATE = 1350.0;
            return won / RATE;
        };

        double dollar = wonToUsd.apply(cash);
        System.out.println("￦ " + cash+ " => ＄ " + dollar);
    }
    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국"," "}를 체크하세요.
     * </pre>
     */
    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Function<String, Boolean> isEmp = (s) -> s.trim().isEmpty();
        for (String s : strList) {
            System.out.println(isEmp.apply(s));
        }
    }
}

