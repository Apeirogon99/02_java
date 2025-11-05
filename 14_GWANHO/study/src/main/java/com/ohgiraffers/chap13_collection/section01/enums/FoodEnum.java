package com.ohgiraffers.chap13_collection.section01.enums;

public enum FoodEnum {

    MEAL_AN_BUTTER_KIMCHI_STEW(0, "String0"),
    MEAL_MINT_SEAWEED_SOUP(1, "String1"),
    MEAL_BUNGEOPPANG_SUSHI(2, "String2"),
    DRINK_RADISH_KIMCHI_LATTE(3, "String3"),
    DRINK_WOOLUCK_SMOOTHIE(4, "String4"),
    DRINK_RAW_CUTTLEFISH_SHAKE(5, "String5");

    private final int value;
    private final String name;

    FoodEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void printVar() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "FoodEnum{" +
                "value=" + value +
                '}';
    }

    public enum MEAL {MEAL_AN_BUTTER_KIMCHI_STEW, MEAL_MINT_SEAWEED_SOUP, MEAL_BUNGEOPPANG_SUSHI};
    public enum DRINK {DRINK_RADISH_KIMCHI_LATTE, DRINK_WOOLUCK_SMOOTHIE, DRINK_RAW_CUTTLEFISH_SHAKE};
}
