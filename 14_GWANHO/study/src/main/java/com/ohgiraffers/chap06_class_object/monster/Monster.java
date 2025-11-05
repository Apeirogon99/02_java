package com.ohgiraffers.chap06_class_object.monster;

public class Monster {
    private final String name;
    private int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void Hit(int damage) {
        if (damage < 0) {
            return;
        }

        hp -= damage;
        if(!isAlive()) {
            System.out.println(name + " 죽음");
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
