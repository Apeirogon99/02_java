package com.ohgiraffers.chap10_exception.section02;

import com.ohgiraffers.chap10_exception.section02.exception.MoneyNegativeException;
import com.ohgiraffers.chap10_exception.section02.exception.NotEnoughMoneyException;
import com.ohgiraffers.chap10_exception.section02.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        if (price < 0) {
            throw new PriceNegativeException("가격이 음수일 수 없다");
        }

        if (money < 0) {
            /* throw를 이용해서 이부분에서 강제로 예외를 발생시킴 */
            throw new MoneyNegativeException("돈이 음수일 수 없습니다.");
        } else {
            System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요~~~");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("돈이 부족합니다.");
        }

    }
}
