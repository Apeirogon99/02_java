package com.ohgiraffers.chap03_method_api;


public class chap04_method_api {
    public static void main(String[] args) {
        chap04_method_api app = new chap04_method_api();

        RefClass ref = new RefClass(10);

        ref.compareNumber(5);
        RefClass.compareStaticNumber(20);

        ref.minNumberOf(10, 20);
        RefClass.maxNumberOf(20, 30);
    }

    public void nonStaticmethod(){
        System.out.println("Non Static Method");
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void passByValue(int num) {
        num += 10;
        System.out.println("Pass By Value:" + num);
    }

}
