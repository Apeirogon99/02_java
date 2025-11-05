package com.ohgiraffers.chap15_lambda.section1.outer;

public interface OuterCalculator {

    @FunctionalInterface
    public interface Add {
        int addToNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Sub {
        int subToNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Mul {
        int mulToNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Div {
        int divToNumbers(int a, int b);
    }
}
