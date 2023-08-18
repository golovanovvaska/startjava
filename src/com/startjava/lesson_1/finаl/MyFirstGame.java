package com.startjava.lesson_1.finаl;

public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 55;
        int PlayerNumber = 63;

        while (computerNumber != PlayerNumber) {
            System.out.print("Число " + PlayerNumber);
            if (computerNumber > PlayerNumber) {
                System.out.print(" меньше");
                PlayerNumber++;
            } else {
                System.out.print(" больше");
                PlayerNumber--;
            }
            System.out.println(" того, что загадал компьютер");
        }
        System.out.println("Вы победили!");
    }
}