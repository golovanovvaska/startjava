package com.startjava.lesson_1.finаl;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        char operation = '%';
        int result = 1;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '^') {
            for (int i = 1; i <= num2 ; i++) {
                result *= num1;
            }
        } else if (operation == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}