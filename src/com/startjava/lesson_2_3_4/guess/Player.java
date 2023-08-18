package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private final int ATEMPTS = 10;
    private final int[] NUMBERS = new int[ATEMPTS];
    private final String NAME;
    private int currentAttempt;
    private int score;

    public Player(String name) {
        NAME = name;
    }

    public void addNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        if (number >= 1 && number <= 100) {
            NUMBERS[currentAttempt] = number;
            currentAttempt++;
        } else {
            System.out.println("Введите число от 1 до 100");
            addNumber(scanner.nextInt());
        }
    }

    public int getNumber() {
        return NUMBERS[currentAttempt - 1];
    }

    public String getName() {
        return NAME;
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }

    public int getAtempts() {
        return ATEMPTS;
    }

    public void addScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public int[] getAll() {
        return Arrays.copyOf(NUMBERS, currentAttempt);
    }

    public void clear() {
        if (currentAttempt != 0) {
            Arrays.fill(NUMBERS, 0, currentAttempt, 0);
        }
        currentAttempt = 0;
        score = 0;
    }
}