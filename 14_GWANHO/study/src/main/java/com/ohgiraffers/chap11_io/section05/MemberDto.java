package com.ohgiraffers.chap11_io.section05;

import java.io.Serializable;

public class MemberDto implements Serializable {

    private String id;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;
    private double point;

    public MemberDto(String id, String pwd, String name, String email, int age, char gender, double point) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }
}
