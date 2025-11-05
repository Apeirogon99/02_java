package com.ohgiraffers.chap17_thread.section2;

public class Application {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Producer(buffer);
        Thread consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
