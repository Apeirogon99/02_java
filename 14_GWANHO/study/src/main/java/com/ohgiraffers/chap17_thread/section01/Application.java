package com.ohgiraffers.chap17_thread.section01;

public class Application {
    public static void main(String[] args) {
        /**
         *  Thread를 생성하는 방법
         *  1. Thread 클래스 상속
         *  2. Runnable 인터페이스를 구현
         */

        Thread t1 = new Car();                  // thread
        Thread t2 = new Tank();                 // thread
        Thread t3 = new Thread(new Plane());    // runnable

        System.out.println("t1 우선 순위 : " + t1.getPriority());
        System.out.println("t2 우선 순위 : " + t2.getPriority());
        System.out.println("t3 우선 순위 : " + t3.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1 우선 순위 : " + t1.getPriority());
        System.out.println("t2 우선 순위 : " + t2.getPriority());
        System.out.println("t3 우선 순위 : " + t3.getPriority());

        t1.run();
        t2.run();
        t3.run();

        t1.start();
        t2.start();
        t3.start();
    }
}
