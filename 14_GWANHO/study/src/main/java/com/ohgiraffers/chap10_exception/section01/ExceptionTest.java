package com.ohgiraffers.chap10_exception.section01;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("Have money : " + money);

        if(money >= price) {
            System.out.println("You have enough money");
        } else {
            throw new Exception();
        }
    }
}
