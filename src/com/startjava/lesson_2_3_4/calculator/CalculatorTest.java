package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                try {
                    System.out.print("Введите математическое выражение: ");
                    String mathExpression = scanner.nextLine();
                    double result = Calculator.calculate(mathExpression);
                    printResult(result, Calculator.getExpression());
                } catch (RuntimeException e) {
                    System.out.println(e);
                    System.out.println("Повторите ввод выражения");
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }

    private static void printResult(double result, String mathExpression) {
        String formatPrint = (result == (int) result) ? "%s = %.0f%n%n" : "%s = %.3f%n%n";
        System.out.printf(formatPrint, mathExpression, result);
    }
}
