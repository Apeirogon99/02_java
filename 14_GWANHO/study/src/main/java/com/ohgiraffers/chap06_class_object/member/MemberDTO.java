package com.ohgiraffers.chap06_class_object.member;

public class MemberDTO {
    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;

    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
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
    public char getGender() {
        return gender;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

}
