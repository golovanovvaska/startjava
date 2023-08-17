package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private int[] numbers = new int[10];
    private String name;
    private int numbersIndex = 0;
    private int attemptCounter = 0;
    private int attempts = 10;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        numbers[numbersIndex] = number;
        numbersIndex++;
    }

    public int getNumber() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != 0) {
                return numbers[i];
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public int getAttempts() {
        return attempts;
    }

    public String getAll() {
        String out = "";
        for (int number : Arrays.copyOf(numbers, numbersIndex)) {
            out += number + " ";
        }
        return out;
    }

    public void reduceAttempts() {
        attempts--;
    }

    public void increaseAttemptCounter() {
        attemptCounter++;
    }

    public void eracePlayer() {
        fillNumbers();
        numbersIndex = 0;
        attemptCounter = 0;
        attempts = 10;
    }

    private void fillNumbers() {
        if (numbersIndex != 0) {
            Arrays.fill(numbers, 0, numbersIndex, 0);
        }
    }
}