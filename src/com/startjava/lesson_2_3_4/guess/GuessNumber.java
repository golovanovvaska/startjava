package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player[] PLAYERS = new Player[3];
    private int secretNumber;

    private int round;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String name1, String name2, String name3) {
        PLAYERS[0] = new Player(name1);
        PLAYERS[1] = new Player(name2);
        PLAYERS[2] = new Player(name3);
    }

    public void start() {
        round++;
        shuffle();
        PLAYERS[0].clear();
        PLAYERS[1].clear();
        PLAYERS[2].clear();
        secretNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Я загадал число от 1 до 100..." + secretNumber);
        boolean endOfAttempts = false;
        while (!endOfAttempts) {
           if (isGuessed(PLAYERS[0])) {
               break;
           }
           if (isGuessed(PLAYERS[1])) {
               break;
           }
           if (isGuessed(PLAYERS[2])) {
               break;
           }
           endOfAttempts = (PLAYERS[0].getAtempts() - PLAYERS[0].getCurrentAttempt() == 0) &&
                   (PLAYERS[1].getAtempts() - PLAYERS[1].getCurrentAttempt() == 0) &&
                   (PLAYERS[2].getAtempts() - PLAYERS[2].getCurrentAttempt() == 0);
        }
        printNumbers(PLAYERS[0]);
        printNumbers(PLAYERS[1]);
        printNumbers(PLAYERS[2]);
        printWinner();
    }

    private boolean isGuessed(Player player) {
        String playersName = player.getName();
        System.out.print(playersName + ", введите число: ");
        player.addNumber(scanner.nextInt());
        int playerNumber = player.getNumber();
        if (playerNumber == secretNumber) {
            System.out.println(playersName + " угадал " + playerNumber + " c "
                    + player.getCurrentAttempt() + " попытки");
            player.addScore();
            return true;
        }
        String state = (playerNumber > secretNumber) ? " больше " : " меньше ";
        System.out.println("Число " + playerNumber + state + " того, что загадал компьютер");
        if (player.getAtempts() - player.getCurrentAttempt() == 0) {
            System.out.println("У игрока " + playersName + " закончились попытки");
        }
        return false;
    }

    private void printNumbers(Player player) {
        int[] NUMBERS = player.getAll();
        for (int number : NUMBERS) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void shuffle() {
        for (int i = PLAYERS.length -1; i > 0; i--) {
            int random = (int) (Math.random() * (i +1));
            Player tmp = PLAYERS[random];
            PLAYERS[random] = PLAYERS[i];
            PLAYERS[i] = tmp;
        }
    }

    private void printWinner() {
        if (round == 3) {
            if (PLAYERS[0].getScore() > PLAYERS[1].getScore() && PLAYERS[0].getScore() > PLAYERS[2].getScore()) {
                System.out.println("Победитель " + PLAYERS[0].getName());
            } else if (PLAYERS[1].getScore() > PLAYERS[0].getScore() && PLAYERS[1].getScore() > PLAYERS[2].getScore()) {
                System.out.println("Победитель " + PLAYERS[1].getName());
            } else if (PLAYERS[2].getScore() > PLAYERS[0].getScore() && PLAYERS[2].getScore() > PLAYERS[1].getScore()) {
                System.out.println("Победитель " + PLAYERS[2].getName());
            } else {
                System.out.println("Победителей нет");
            }
            round = 0;
        }
    }
}