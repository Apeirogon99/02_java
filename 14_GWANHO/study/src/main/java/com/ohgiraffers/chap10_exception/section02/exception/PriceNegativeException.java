package com.ohgiraffers.chap10_exception.section02.exception;

public class PriceNegativeException extends Exception {

    public PriceNegativeException(String message) {
        super(message);
    }
}
