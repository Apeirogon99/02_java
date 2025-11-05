package com.ohgiraffers.chap10_exception.section01;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();

        try {
            test.checkEnoughMoney(100000, 500000);
            test.checkEnoughMoney(500000, 100000);

            System.out.println("상품 구입");
        } catch (Exception e) {
            System.out.println("상품 구입 불가");
            e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }

    }
}
