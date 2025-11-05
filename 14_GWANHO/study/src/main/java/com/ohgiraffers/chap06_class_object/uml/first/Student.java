package com.ohgiraffers.chap06_class_object.uml.first;

public class Student {
    private String studentId;
    private String name;
    private String major;

    public  Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
    }

    public void enroll(Course course) {

    }

    public void drop(Course course) {

    }
}
