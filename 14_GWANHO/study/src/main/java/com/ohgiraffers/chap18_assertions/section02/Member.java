package com.ohgiraffers.chap18_assertions.section02;

public class Member {
    int seq;
    String id;
    String name;
    int age;

    public Member(int seq, String id, String name, int age) {
        this.seq = seq;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "seq=" + seq +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
