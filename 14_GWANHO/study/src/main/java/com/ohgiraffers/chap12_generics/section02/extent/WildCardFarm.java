package com.ohgiraffers.chap12_generics.section02.extent;

public class WildCardFarm {

    // 모두
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // 바니이거나 후손 타입
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    // 바니이거나 부모 타입
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
