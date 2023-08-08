package lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int end = 21;
        int sumOdd = 0;
        int sumEven = 0;
        int counter = start;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= end);

        System.out.println("В отрезке [" + start + "," + end + "] сумма четных чисел = " + sumEven
                + ", а нечетных = " + sumOdd);

        System.out.println("\n\n2. Вывод чисел в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num2;
        int min = num1;

        if (num1 > max) {
            max = num1;
        } 
        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num4 = 1234;
        int sum = 0;

        System.out.print("Исходное число в обратном порядке: ");
        while (num4 > 0) {
            int digit = num4 % 10;
            System.out.print(digit);
            sum += digit;
            num4 /= 10;
        }
        
        System.out.println("\nСумма его цифр: " + sum);

        System.out.println("\n\n4. Вывод чисел в несколько строк\n");

        start = 1;
        end = 30;

        for (int i = start; i <= end; i++) {
            if(i % 2 != 0) {
                System.out.printf("%3d", i);
            }
            if (i % 10 == 0 && i != end) {
                System.out.println();
            }
        }

        if (end % 10 != 0) {
              for (int i = 1; i <= (10 - end % 10) / 2; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность\n");

        int num5 = 3242592;
        int copyNum5 = num5;
        int countTwos = 0;

        while (copyNum5 > 0) {
            if (copyNum5 % 10 == 2) {
                countTwos++;
            }
            copyNum5 /= 10;
        }

        System.out.print("В " + num5);
        if (countTwos % 2 == 0) {
            System.out.print(" (четное)");
        } else {
            System.out.print(" (нечетное)");
        }
        System.out.println(" количество двоек - " + countTwos);

        System.out.println("\n\n6. Отображение геометрических фигур\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int rowCount = 5;
        while (rowCount > 0) {
            int charactersPerLine = rowCount;
            while (charactersPerLine > 0) {
                System.out.print("#");
                charactersPerLine--;
            }
            
            System.out.print("\n");
            rowCount--;
        }
        System.out.println();

        rowCount = 1;
        do {
            int charCount = rowCount;
            if (rowCount == 4) {
                charCount = 2;
            } else if (rowCount == 5) {
                charCount = 1;
            }
            do {
                System.out.print("$");
                charCount--;
            } while (charCount > 0);

            System.out.print("\n");
            rowCount++;
        } while (rowCount <= 5);

        System.out.println("\n\n7. Отображение ASCII-символов\n");

        System.out.printf("%n%2s%2s", "DECIMAL", " CHARACTER");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%n%4s%8c", i, (char) i);
            }
        }
         for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%n%4s%8c", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int num6 = 1234321;
        int copyNum6 = num6;
        int invertedNum6 = 0;

        while (copyNum6 > 0) {
            invertedNum6 = invertedNum6 * 10 + (copyNum6 % 10);
            copyNum6 /= 10;
        }
        System.out.print("Число " + num6);
        if (num6 == invertedNum6) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }

        System.out.println("\n\n9. Проверка, является ли число счастливым\n");

        int num8 = 123321;
        int copyNum8 = num8;
        int firstDigits = 0;
        int lastDigits = 0;
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                lastDigits += copyNum8 % 10;
            } else {
                firstDigits += copyNum8 % 10;
            }
            copyNum8 /= 10;
        }
        if (firstDigits == lastDigits) {
            System.out.println("Число " + num8 + " является счастливым");
        } else {
            System.out.println("Число " + num8 + "  не является счастливым");
        }
        System.out.println("Сумма цифр "+ num8 / 1000 + " = " + firstDigits + ",  а сумма цифр " + num8 % 1000
                + " = " + lastDigits);

        System.out.println("\n\n10. Отображение таблицы умножения Пифагора\n");

        System.out.print(" | ");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d%s", i, " ");
        }
        System.out.println();

        System.out.println("--------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + "| ");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%2d%s", i * j, " ");
            }
        System.out.println();
        }
    }
}