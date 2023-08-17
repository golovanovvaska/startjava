package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int compNumber;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String p1, String p2) {
        player1 = new Player(p1);
        player2 = new Player(p2);
    }

    public void start() {
        player1.eracePlayer();
        player2.eracePlayer();
        compNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Я загадал число от 1 до 100..." + compNumber);
        boolean endOfAttempts = false;
        while (!endOfAttempts) {
           if (checkNumber(player1)) {
               break;
           }
           if (checkNumber(player2)) {
               break;
           }
           endOfAttempts = (player1.getAttempts() == 0) && (player2.getAttempts() == 0);
        }
        System.out.println(player1.getAll());
        System.out.println(player2.getAll());
    }

    private boolean checkNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
        if (player.getNumber() == compNumber) {
            player.increaseAttemptCounter();
            System.out.println(player.getName() + " угадал " + player.getNumber() + " c "
                    + player.getAttemptCounter() + " попытки");
            return true;
        }
        String text = (player.getNumber() > compNumber) ? " больше " : " меньше ";
        System.out.println("Число " + player.getNumber() + text + " того, что загадал компьютер");
        player.increaseAttemptCounter();
        player.reduceAttempts();
        if (player.getAttempts() == 0) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }
}