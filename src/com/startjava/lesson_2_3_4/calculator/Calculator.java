package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static String expression;

    public static double calculate(String mathExpression) throws RuntimeException {
        String[] elements = mathExpression.split(" ");
        if (elements.length != 3) {
            throw new RuntimeException("Неправильное математическое выражение");
        }
        int num1 = checkNum(elements[0]);
        int num2 = checkNum(elements[2]);
        char operation = elements[1].charAt(0);
        expression = "" + num1 + operation + num2;
        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> throw new RuntimeException("Ошибка: знак " + operation + " не поддерживается");
       };
    }

    public static String getExpression() {
        return expression;
    }

    private static int checkNum(String elementsNum) {
        int num;
        try {
            num = Integer.parseInt(elementsNum);
        } catch (RuntimeException e) {
            throw new RuntimeException("Числа должны быть целыми");
        }
        if (num <= 0) {
            throw new RuntimeException("Числа должны быть положительными");
        }
        return num;
    }
}
