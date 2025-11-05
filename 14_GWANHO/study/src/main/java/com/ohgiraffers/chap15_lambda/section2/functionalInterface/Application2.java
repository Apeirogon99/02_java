package com.ohgiraffers.chap15_lambda.section2.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {

        /* Supplier<T>#get():T ==> 객체 T를 리턴한다 */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        /* BooleanSupplier#getAsBoolean():boolean */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0 ? false : true;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /* IntSupplier#getAsInt():int */
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

        /* LongSupplier#getAsInt():int */
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println(longSupplier.getAsLong());

        /* DoubleSupplier#getAsInt():int */

    }
}
