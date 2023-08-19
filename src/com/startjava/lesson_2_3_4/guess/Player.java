package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int ATEMPTS = 10;
    private int[] numbers = new int[ATEMPTS];
    private String name;
    private int currentAttempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public void addNumber(int number) {
        numbers[currentAttempt] = number;
        currentAttempt++;
    }

    public int getNumber() {
        return numbers[currentAttempt - 1];
    }

    public String getname() {
        return name;
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }
    public void resetScore() {
        score = 0;
    }

    public void increaseScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public int[] getAll() {
        return Arrays.copyOf(numbers, currentAttempt);
    }

    public void clear() {
        if (currentAttempt > 0) {
            Arrays.fill(numbers, 0, currentAttempt, 0);
            currentAttempt = 0;
        }
    }
}