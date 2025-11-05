package com.ohgiraffers.chap18_assertions.section01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(1, 1);
        assertEquals(2, result);
    }
}