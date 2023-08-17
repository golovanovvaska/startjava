package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Первый игрок, представьтесь: ");
        String player1 = scanner.nextLine();
        System.out.print("Второй игрок, представьтесь: ");
        String player2 = scanner.nextLine();
        System.out.println("Игра началась! У каждого игрока по 10 попыток");
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}