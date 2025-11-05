package com.ohgiraffers.chap06_class_object.monster;

public class chap06_monster {
    public static void main(String[] args) {

        Monster monster1 = new Monster("고블린", 100);
        Monster monster2 = new Monster("오크", 200);

        System.out.println(monster1);
        System.out.println(monster2);

        monster1.Hit(100);
    }
}
