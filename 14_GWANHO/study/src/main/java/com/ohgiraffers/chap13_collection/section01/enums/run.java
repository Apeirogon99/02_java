package com.ohgiraffers.chap13_collection.section01.enums;

public class run {
    public static void main(String[] args) {

        // 열거형을 이용하여 상수 열거 패턴의 단점을 해결

        boolean isTrue = enumTest(FoodEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(isTrue);

        System.out.println(FoodEnum.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(FoodEnum.MEAL_BUNGEOPPANG_SUSHI);

        FoodEnum.MEAL meals = FoodEnum.MEAL.MEAL_AN_BUTTER_KIMCHI_STEW;
        System.out.println("meals:" + meals);

        System.out.println(EnumType.valueOf("JAVA"));

        for(EnumType type : EnumType.values()){
            System.out.println("type:" + type);
        }

        for(EnumType type : EnumType.values()){
            System.out.println("ordinal = " + type.ordinal());
        }

        System.out.println("name : " + EnumType.MARIADB.name());
        System.out.println("name : " + EnumType.MARIADB.toString());

    }

    private static boolean enumTest(FoodEnum lhs, FoodEnum rhs) {
        if(lhs == rhs){
            return true;
        }
        return false;
    }
}
