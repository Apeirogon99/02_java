package com.ohgiraffers.chap04_control_flow;

import java.util.Scanner;

public class chap05_Loop {
    public static void main(String[] args) {
        chap05_Loop app =  new chap05_Loop();
        app.printStar();
    }

    public void NotLooping() {

        Scanner sc = new Scanner(System.in);

        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");

        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");

        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");

        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");

        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");

        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");

        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");

        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");

        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");

        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        sc.close();
    }

    public void Looping() {
        Scanner sc = new Scanner(System.in);

        final int STUDENT_COUNT = 10;
        for(int i = 0; i < STUDENT_COUNT; i++) {
            System.out.print( (i + 1) + " 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println((i + 1) + " 번째 학생의 이름은 " + student + "입니다.");
        }

        System.out.println(STUDENT_COUNT + "명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        sc.close();
    }

    public void test3() {
        int random = (int)(Math.random() * 6) + 5;

    }

    public void printStar() {
        for (int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
