package com.ohgiraffers.chap12_generics.section02.extent;

public class RabbitFarm<T extends Rabbit> {
    T animal = null;

    public RabbitFarm() {

    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
