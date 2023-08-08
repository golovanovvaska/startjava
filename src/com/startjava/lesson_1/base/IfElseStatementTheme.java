package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        boolean male = true;

        if (!male) {
            System.out.println("Вы женщина");
        } else {
            System.out.println("Вы мужчина");
        }

        int age = 15;

        if (age > 18) {
            System.out.println("Вам больше 18 лет");
        } else {
            System.out.println("Вам меньше 18 лет");
        }

        double height = 1.75;

        if (height < 1.8) {
            System.out.println("Ваш рост меньше 1,8 метра");
        } else {
            System.out.println("Ваш рост больше или равен 1,8 метра");
        }

        char firstLetterOfName = "Ivan".charAt(0);

        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква вашего имени - М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква вашего имени - I");
        } else {
            System.out.println("ХЗ какая буква первая");
        }

        System.out.println("\n\n2. Поиск большего числа\n");

        int num1 = 3;
        int num2 = 3;

        if (num1 > num2) {
            System.out.println(num1 + ">" + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + "<" + num2);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n\n3. Проверка числа\n");

        int num3 = -32;
    
        if (num3 == 0) {
            System.out.println("Число является нулем");
        } else {
            System.out.print("Число " + num3 + " является");
            if (num3 > 0) {
                System.out.print(" положительным");
            } else {
                System.out.print(" отрицательным");
            }
            if (num3 % 2 == 0) {
                System.out.println(" и четным");
            } else {
                System.out.println(" и нечетным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

        int num4 = 123;
        int num5 = 321;

        boolean isEqualOnes = num4 % 10 == num5 % 10;
        boolean isEqualTens = num4 % 100 / 10 == num5 % 100 / 10;
        boolean isEqualHundreds = num4 / 100 == num5 / 100;

        if (isEqualOnes || isEqualTens || isEqualHundreds) {
            System.out.println("Одинаковые цифры ");
            if (isEqualOnes) {
                System.out.println(num4 % 10 + " в 1м разряде");
            }
            if (isEqualTens) {
                System.out.println(num4 % 100 / 10 + " в 2м разряде");
            }
            if (isEqualHundreds) {
                System.out.println(num4 / 100 + " в 3м разряде");
            }
        } else {
            System.out.println("Одинаковых цифр нет");
        }

        System.out.println("\n\n5. Определение символа по его коду\n");

        char character = '\u0031';

        System.out.print("Символ " + character);

        if (character >= 'A' && character <= 'Z') {
            System.out.println(" является большой буквой");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println(" является маленькой буквой");
        } else if (character >= '0' && character <= '9') {
            System.out.println(" является цифрой");
        } else {
            System.out.println(" не является ни буквой и ни цифрой");
        }

        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %\n");

        int deposit = 105_000;
        double depositInterest = 0.1;

        if (deposit < 100_000) {
            depositInterest = 0.05;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            depositInterest = 0.07;
        }

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Сумма начисленного %: " + (int) (deposit * depositInterest));
        System.out.println("Итоговая сумма: " + (int) (deposit * depositInterest + deposit));

        System.out.println("\n\n7. Определение оценки по предметам\n");

        int historyPercent = 59;
        int historyScore = 5;

        if (historyPercent <= 60) {
            historyScore = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyScore = 4;
        }

        int programmingPercent = 92;
        int programmingScore = 5;

        if (programmingPercent <= 60) {
            programmingScore = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingScore = 4;
        }

        System.out.println("История: " + historyScore);
        System.out.println("Программирование: " + programmingScore);
        System.out.println("Средний балл оценок по предметам: " + (double) (historyScore + programmingScore) / 2);
        System.out.println("Средний % по предметам: " + (double) (historyPercent + programmingPercent) / 2);

        System.out.println("\n\n8. Расчет годовой прибыли\n");

        int sales = 13_000;
        int rent = 5_000;
        int productionCost = 9_000;

        int profit = (sales - rent - productionCost) * 12;

        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit );
        } else {
           System.out.println("Прибыль за год: " + profit ); 
        }
    }
}