package com.ohgiraffers.chap15_lambda.section1.outer;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Add add = (x, y) -> x + y;
        System.out.println(add.addToNumbers(10, 20));

        OuterCalculator.Sub sub = (x, y) -> x - y;
        System.out.println(sub.subToNumbers(10, 20));

        OuterCalculator.Mul mul = (x, y) -> x * y;
        System.out.println(mul.mulToNumbers(10, 20));

        OuterCalculator.Div div = (x, y) -> x / y;
        System.out.println(div.divToNumbers(10, 20));

    }
}
