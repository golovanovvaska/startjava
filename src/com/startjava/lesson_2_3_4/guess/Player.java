package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private int[] numbers = new int[10];
    private String name;
    private int attemptCounter;
    private int attempts = 10;

    public Player(String name) {
        this.name = name;
    }

    public void addNumber(int number) {
        numbers[attemptCounter] = number;
        attemptCounter++;
        attempts--;
    }

    public int getNumber() {
        return numbers[attemptCounter-1];
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

    public int[] getAll() {
        return Arrays.copyOf(numbers, attemptCounter);
    }

    public void eracePlayer() {
        fillNumbers();
        attemptCounter = 0;
        attempts = 10;
    }

    private void fillNumbers() {
        if (attemptCounter != 0) {
            Arrays.fill(numbers, 0, attemptCounter, 0);
        }
    }
}