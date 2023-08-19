package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Игра началась! У каждого игрока по 10 попыток");
        GuessNumber game = new GuessNumber(greeting(), greeting(), greeting());
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            Scanner scanner = new Scanner (System.in);
            answer = scanner.next();
        } while (!answer.equals("no"));
    }

    private static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        return scanner.nextLine();
    }
}