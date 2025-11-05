package com.ohgiraffers.chap06_class_object.car;

public class Car {
    private boolean isOn;
    private int speed;

    public void startUp() {
        if(isOn) {
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            isOn = true;
            System.out.println("시동을 걸었습니다.");
        }
    }

    public void go() {
        if(!isOn) {
            System.out.println("시동이 안걸려 있습니디.");
        }

        speed += 10;
        System.out.println("차가 앞으로 움직입니다. 현재 속도는" + speed);
    }

    public void stop() {
        if(!isOn) {
            System.out.println("시동이 안걸려 있습니다.");
        } else {
            isOn = false;
            System.out.println("시동을 멈추었습니다.");
        }
    }

    public void turnOff() {
        if(!isOn) {
            System.out.println("시동이 이미 꺼져 있습니다.");
            return;
        }

        if(speed > 0) {
            System.out.println("시동먼저 꺼죠");
            return;
        }

        isOn = false;
        System.out.println("자동차를 멈춥니다.");
    }
}
