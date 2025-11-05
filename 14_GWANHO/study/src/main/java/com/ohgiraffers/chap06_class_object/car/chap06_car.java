package com.ohgiraffers.chap06_class_object.car;

import java.util.Scanner;

public class chap06_car {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String menuText = "";
        int input = 0;

        CarRacer carRacer = new CarRacer();

        do{
            System.out.print(menuText);
            input = sc.nextInt();
            switch (input) {
                case 1: carRacer.startUp(); break;
                case 2: carRacer.stepAccelator(); break;
                case 3: carRacer.stepBreak(); break;
                case 4: carRacer.turnOff(); break;
                case 9:
                    System.out.println("프로그램을 종료하겠습니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }

        }while(input != 9);
    }
}
