package com.ohgiraffers.chap18_assertions.section01;

import com.ohgiraffers.chap18_assertions.section01.Person;
import com.ohgiraffers.chap18_assertions.section01.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JupiterAssertionsTest {

    @Test
    void testAssertEquals() {
        /* given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 30;

        /* when */
        Calculator calculator = new Calculator();
        int result = calculator.add(firstNum, secondNum);

        /* then */
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testAssertNull() {
        String str = null;

        Assertions.assertNull(str);
    }

    @Test
    void testAssertAll() {
        String firstName = "길동";
        String lastName = "홍";

        Person person = new Person(firstName, lastName);

        Assertions.assertAll(
                () -> Assertions.assertEquals(firstName, person.getFirstName()),
                () -> Assertions.assertEquals(lastName, person.getLastName())
        );
    }

    @Test
    void testDivideNumbers() {
        int firstNum = 10;
        int secondNum = 20;

        NumberValidation validation = new NumberValidation();
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> validation.checkDivideNumbers(firstNum, 0)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(
                        IllegalArgumentException.class,
                        exception
                ),

                () -> Assertions.assertEquals(
                        "0으로는 값을 나눌 수 없습니다.",
                        exception.getMessage()
                )
        );
    }
}