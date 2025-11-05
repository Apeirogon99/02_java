package com.ohgiraffers.chap02_operator;

public class chap03_operator_example {
    public static void main(String[] args) {

        /**
         * 문제 1
         */
        {
            int a = 3;
            int b = 5;
            int c = -1;
            int d = a + --b;
            b = 2 * (-c + a++) - d;
            c *= 2;
            a = b++ + c;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
        }

        /**
         * 문제 2
         */
        {

        }
    }
}
