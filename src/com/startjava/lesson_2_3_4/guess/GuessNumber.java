package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void start() {
        player1.eracePlayer();
        player2.eracePlayer();
        secretNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Я загадал число от 1 до 100..." + secretNumber);
        boolean endOfAttempts = false;
        while (!endOfAttempts) {
           if (isGuessed(player1)) {
               break;
           }
           if (isGuessed(player2)) {
               break;
           }
           endOfAttempts = (player1.getAttempts() == 0) && (player2.getAttempts() == 0);
        }
        printNumbers(player1);
        printNumbers(player2);
    }

    private boolean isGuessed(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(scanner.nextInt());
        if (player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал " + player.getNumber() + " c "
                    + player.getAttemptCounter() + " попытки");
            return true;
        }
        String state = (player.getNumber() > secretNumber) ? " больше " : " меньше ";
        System.out.println("Число " + player.getNumber() + state + " того, что загадал компьютер");
        if (player.getAttempts() == 0) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void printNumbers(Player player) {
        int[] numbers = player.getAll();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}