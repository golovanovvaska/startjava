package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        String[] elems = mathExpression.split(" ");
        int num1 = Integer.parseInt(elems[0]);
        int num2 = Integer.parseInt(elems[2]);
        char operation = elems[1].charAt(0);
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                return Math.pow(num1, num2);
            default:
                System.out.println("Ошибка: знак " + operation + " не поддерживается");
                return Double.MIN_VALUE;
       }
    }
}
