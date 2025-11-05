package com.ohgiraffers.chap10_exception.section02.exception;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}