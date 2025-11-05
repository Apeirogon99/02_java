package com.ohgiraffers.chap15_lambda.section3;

public class Member {
    String name;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }

    public Member(String name) {
        this.name = name;
    }
}
