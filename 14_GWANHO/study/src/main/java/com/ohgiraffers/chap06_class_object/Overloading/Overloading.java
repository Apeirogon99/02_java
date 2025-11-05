package com.ohgiraffers.chap06_class_object.Overloading;

import java.util.Arrays;

public class Overloading {

    public static void main(String[] args) {

        test1("123", "456");
    }

    public static void test1(String... args) {
        System.out.println(Arrays.toString(args));
    }

    /**
     * 오버로딩 : 같은 클래스 매개변수만 다름
     * 사용이유 : 매개 변수의 종류별로 메소드 내용을 다르게 작성
    */

    /**
     * 메소드의 시그니쳐
     * 메소드의 메소드명과 파라밑터 선언부 부분을 메소드의 시그니처라고 한다
     */

    /**
     * 오버라이딩 : 상속 관계에서 같은 메소드를 재정의한 것
     */

    public void test() {

    }

    public void test(int num) {

    }

    /**
     * 파라미터로 사용 가능한 자료형
     * 1. 기본자료형
     * 2. 기본자료형 배열
     * 3. 클래스자료형(참조자료형)
     * 4. 클래스자료형 배열(객체 배열이지만 다음쳅터에서 다룰예정)
     * 5. 가변인자
     */



}
