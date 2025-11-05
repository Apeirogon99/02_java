package com.ohgiraffers.chap17_thread.section01;

public class Car extends Thread {

    /* 쓰레드 run */
    @Override
    public void run() {
        for(int i = 0; i< 1000; ++i) {
            System.out.println("Car is running");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
