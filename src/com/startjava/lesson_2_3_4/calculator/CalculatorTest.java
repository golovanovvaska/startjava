package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                double result = calculator.calculate(mathExpression);
                if (result != Double.MIN_VALUE) {
                    if (result == (int) result) {
                        System.out.printf("%s = %.0f%n%n", mathExpression, result);
                    } else {
                        System.out.printf("%s = %.3f%n%n", mathExpression, result);
                    }
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }
}
