package lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            System.out.println("Результат: " + calculator.getNum1() + " " + calculator.getOperation() + " "
                    + calculator.getNum2() + " = " + calculator.calculate());

            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                }
            }
        } while (answer.equals("yes"));
        scanner.close();
    }
}
