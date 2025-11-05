package com.ohgiraffers.chap12_generics.section02.extent.run;

import com.ohgiraffers.chap12_generics.section02.extent.*;

public class Application2 {
    public static void main(String[] args) {
        WildCardFarm farm = new WildCardFarm();

        farm.anyType(new RabbitFarm<Bunny>(new Bunny()));

        //farm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        farm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        farm.extendsType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));

        farm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        farm.superType(new RabbitFarm<Rabbit>(new DrunkBunny()));
        //farm.superType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));
    }
}
