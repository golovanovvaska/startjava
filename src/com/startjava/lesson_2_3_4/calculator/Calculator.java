package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] elems = mathExpression.split(" ");
        if (elems.length != 3) {
            throw new RuntimeException("Неправильное математическое выражение");
        }
        int num1 = checkNum(elems[0]);
        int num2 = checkNum(elems[2]);
        char operation = elems[1].charAt(0);
        return switch (operation) {
            case '+':
                yield  num1 + num2;
            case '-':
                yield  num1 - num2;
            case '*':
                yield num1 * num2;
            case '/':
                yield (double) num1 / num2;
            case '%':
                yield num1 % num2;
            case '^':
                yield Math.pow(num1, num2);
            default:
                throw new RuntimeException("Ошибка: знак " + operation + " не поддерживается");
       };
    }

    private static int checkNum(String num) {
        int number = 0;
        try {
            number = Integer.parseInt(num);
        } catch (RuntimeException e) {
            System.out.println("Числа должны быть целыми");
        }
        if (number <= 0) {
            throw new RuntimeException("Числа должны быть положительными");
        }
        return number;
    }
}
