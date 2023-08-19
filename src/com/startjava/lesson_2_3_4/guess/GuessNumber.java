package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static final int COUNT_OF_PLAYERS = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private Player[] players = new Player[COUNT_OF_PLAYERS];
    private int secretNumber;
    private int round;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String name1, String name2, String name3) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
    }

    public void start() {
        round++;
        shuffle();
        for (Player player : players) {
            player.clear();
        }
        secretNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Я загадал число от 1 до 100..." + secretNumber);
        boolean endOfAttempts = false;
        boolean isPlayerGuesed = false;
        while (!endOfAttempts && !isPlayerGuesed) {
            for (Player player : players) {
                if (isGuessed(player)) {
                    isPlayerGuesed = true;
                    break;
                }

            }
           endOfAttempts = (players[0].getCurrentAttempt() == Player.ATEMPTS) &&
                   (players[1].getCurrentAttempt() == Player.ATEMPTS) &&
                   (players[2].getCurrentAttempt() == Player.ATEMPTS);
        }
        for (Player player : players) {
            printNumbers(player);
        }
        if (round == 3) {
            System.out.println(printWinner(players));
        }
    }

    private void shuffle() {
        for (int i = players.length - 1; i > 0; i--) {
            int random = (int) (Math.random() * (i + 1));
            if (random == i) {
                i++;
                continue;
            }
            Player tmp = players[random];
            players[random] = players[i];
            players[i] = tmp;
        }
    }

    private boolean isGuessed(Player player) {
        String name = player.getname();
        System.out.println(name + ", введите число");
        player.addNumber(checkNumber());
        int number = player.getNumber();
        if (number == secretNumber) {
            System.out.println(name + " угадал " + number + " c "
                    + player.getCurrentAttempt() + " попытки");
            player.increaseScore();
            return true;
        }
        String state = (number > secretNumber) ? " больше " : " меньше ";
        System.out.println("Число " + number + state + " того, что загадал компьютер");
        if (player.getCurrentAttempt() == Player.ATEMPTS) {
            System.out.println("У игрока " + name + " закончились попытки");
        }
        return false;
    }

    private int checkNumber() {
        int number = 0;
        while (!(number >= MIN_NUMBER && number <= MAX_NUMBER)) {
            System.out.println("Число должно быть в интервале от 1 до 100");
            number = scanner.nextInt();
        }
        return number;
    }

    private void printNumbers(Player player) {
        int[] numbers = player.getAll();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private String printWinner(Player[] players) {
        String winner = null;
        round = 0;
            int scores = players[0].getScore();
            for (int i = 1; i < players.length; i++) {
                if (players[i].getScore() == scores) {
                    return "Победителей нет";
                }
            }
            scores = 0;
            for (Player player : players) {
                if (player.getScore() > scores) {
                    scores = player.getScore();
                }
            }
            for (Player player : players) {
                if (player.getScore() == scores) {
                    winner = player.getname();
                    player.resetScore();
                }
            }
        return "Победитель " + winner;
    }
}