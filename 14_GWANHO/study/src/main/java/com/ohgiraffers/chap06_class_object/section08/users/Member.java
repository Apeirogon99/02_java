package com.ohgiraffers.chap06_class_object.section08.users;

public class Member {
    private int num;
    private String id;
    private String password;
    private String name;
    private int age;
    private char gender;

    public Member(int num, String id, String password, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void setNum(int num) {
        this.num = num;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return num + " " + id + " " + password + " " + name + " " + age + " " + gender;
    }
}
