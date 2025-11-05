package com.ohgiraffers.chap13_collection.section01.enums;

import java.util.EnumSet;

public class Application2 {
    public static void main(String[] args) {

        EnumSet<FoodEnum> foods = EnumSet.allOf(FoodEnum.class);

        System.out.println("=======================================");
        for (FoodEnum food : foods) {
            System.out.println(food.getName() + " : " + food.getValue());
        }

        EnumSet<FoodEnum> foods2 = EnumSet.of(
                FoodEnum.DRINK_RADISH_KIMCHI_LATTE,
                FoodEnum.MEAL_BUNGEOPPANG_SUSHI
        );

        System.out.println("=======================================");
        for (FoodEnum food : foods2) {
            System.out.println(food.getName() + " : " + food.getValue());
        }

        /* 특정 상수값만 제외하고 Set에 추가 */
        EnumSet<FoodEnum> foods3 =
                EnumSet.complementOf(
                        EnumSet.of(
                            FoodEnum.DRINK_RADISH_KIMCHI_LATTE,
                            FoodEnum.MEAL_BUNGEOPPANG_SUSHI
                ));

        System.out.println("=======================================");
        for (FoodEnum food : foods3) {
            System.out.println(food.getName() + " : " + food.getValue());
        }

    }
}
