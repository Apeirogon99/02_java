package com.ohgiraffers.chap06_class_object.section06.singleton;

public class EagerSingleton {
    private static final EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
