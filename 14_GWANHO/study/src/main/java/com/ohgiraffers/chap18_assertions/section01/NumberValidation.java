package com.ohgiraffers.chap18_assertions.section01;

public class NumberValidation {
    public void checkDivideNumbers(int firstNum, int secondNum){
        if(secondNum == 0) {
            throw new IllegalArgumentException("0으로는 값을 나눌 수 없습니다.");
        }
    }
}
