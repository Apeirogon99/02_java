package com.ohgiraffers.chap06_class_object.car;

public class CarRacer {

    private final Car car =  new Car();

    public void startUp() {
        car.startUp();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }

}
