package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        invertValues();

        System.out.println("\n2. Произведение элементов массива");
        multiplyElements();

        System.out.println("\n\n3. Удаление элементов массива");
        deleteElements();

        System.out.println("\n\n4. Вывод алфавита лесенкой");
        printAlphabet();

        System.out.println("\n\n5. Заполнение массива уникальными числами");
        fillUniqueNUMBERS();
    }

    public static void invertValues() {
        int[] NUMBERS = {1, 5, 4, 2, 6, 3, 7};
        System.out.print("До реверса: ");
        print(NUMBERS);
        int length = NUMBERS.length;
        int avIndex = length / 2;
        for (int i = 0; i < avIndex; i++) {
            length--;
            int temp = NUMBERS[i];
            NUMBERS[i] = NUMBERS[length];
            NUMBERS[length] = temp;
        }
        System.out.print("После реверса: ");
        print(NUMBERS);
    }

    public static void multiplyElements() {
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= multipliers[i];
            String operation = (i == length - 2) ? " = " : " * ";
            System.out.print(multipliers[i] + operation);
        }
        System.out.print(result);
    }

    public static void deleteElements() {
        double[] realNUMBERS = new double[15];
        int length = realNUMBERS.length;
        for (int i = 0; i < length; i++) {
            realNUMBERS[i] = Math.random();
        }
        printInTwoLines(realNUMBERS);
        double valueInAvIndex = realNUMBERS[length / 2];
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (realNUMBERS[i] > valueInAvIndex) {
                realNUMBERS[i] = 0;
                counter++;
            }
        }
        printInTwoLines(realNUMBERS);
        System.out.print("Количество обнуленных ячеек: " + counter);
    }

    public static void printAlphabet() {
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) (65 + i);
        }
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[length - 1 - j]);
            }
            if (i != 0) {
                System.out.println();
            }
        }
    }

    public static void fillUniqueNUMBERS() {
        int[] uniqueNUMBERS = new int[30];
        int length = uniqueNUMBERS.length;
        for (int i = 0; i < length; i++) {
            boolean isUnique;
            do {
                uniqueNUMBERS[i] = (int) (Math.random()*(100 - 60)) + 60;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNUMBERS[i] == uniqueNUMBERS[j]) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
        }
        int temp;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNUMBERS[j] > uniqueNUMBERS[j + 1]) {
                    temp = uniqueNUMBERS[j];
                    uniqueNUMBERS[j] = uniqueNUMBERS[j + 1];
                    uniqueNUMBERS[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(uniqueNUMBERS[i] + " ");
        }
    }

    private static void print(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.printf(array[i] + ", ");
            }
        }
        System.out.println();
    }
    private static void printInTwoLines(double[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f%s", array[i], " ");
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
