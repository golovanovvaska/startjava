package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("male");
        wolf.setNAME("Шарик");
        wolf.setWeight(20.5);
        wolf.setAge(9);
        wolf.setColor("grey");

        System.out.println(wolf.getGender());
        System.out.println(wolf.getNAME());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}