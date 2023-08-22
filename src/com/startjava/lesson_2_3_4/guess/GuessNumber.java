package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int PLAYERS_COUNT = 3;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    private static final int ROUNDS = 3;
    private Player[] players = new Player[PLAYERS_COUNT];
    private int secretNumber;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String[] names) {
        for (int i = 0; i < PLAYERS_COUNT; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        shuffle();
        init();
        System.out.println("Я загадал число от 1 до 100..." + secretNumber);
        boolean isPlayerGuesed = false;
        for (int i = 0; i < ROUNDS; i++) {
            while (!hasAtempts(players) && !isPlayerGuesed) {
                for (Player player : players) {
                    if (isGuessed(player)) {
                        isPlayerGuesed = true;
                        break;
                    }
                }
            }
        }
        System.out.println(determineWinner(players));
        printNumbers(players);
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

    private void init() {
        for (Player player : players) {
            player.clear();
        }
        secretNumber = (int) ((Math.random() * 100) + 1);
    }

    private boolean isGuessed(Player player) {
        String name = player.getName();
        System.out.println(name + ", введите число");
        while (!player.addNumber(scanner.nextInt())){
            System.out.println("Число должно быть в интервале от 1 до 100");
        }
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

    private boolean hasAtempts(Player[] players) {
        for (Player player : players) {
            if (player.getCurrentAttempt() != Player.ATEMPTS) {
                return false;
            }
        }
        return true;
    }

    private void printNumbers(Player[] players) {
        for (Player player : players) {
            int[] numbers = player.getAll();
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private String determineWinner(Player[] players) {
        String winner = null;
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
                    winner = player.getName();
                    player.resetScore();
                }
            }
        return "Победитель " + winner;
    }
}