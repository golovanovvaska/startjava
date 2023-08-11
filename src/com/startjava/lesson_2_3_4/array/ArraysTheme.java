package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

    public static void main(String[] args) {
        System.out.print("1. Реверс значений массива\n");
        invert();

        System.out.print("\n2. Произведение элементов массива\n");
        multiply();

        System.out.print("\n\n3. Удаление элементов массива\n");
        delete();

        System.out.print("\n\n4. Вывод алфавита лесенкой\n");
        printTheAlphabet();

        System.out.print("\n\n5. Заполнение массива уникальными числами\n");
        fillAnArrayWithUniqueNumbers();
    }

    public static void invert() {
        int[] numbers = {1, 5, 4, 2, 6, 3, 7};
        System.out.print("До реверса: ");
        printArray(numbers);
        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - i - 1];
            numbers[length - i - 1] = temp;
        }
        System.out.print("После реверса: ");
        printArray(numbers);
    }

    public static void multiply() {
        int[] numbers = new int[10];
        int length = numbers.length;
        for (int i = 0; i <= length - 1; i++) {
            numbers[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= numbers[i];
            String operation = (i == length - 2) ? " = " : " * ";
            System.out.print(numbers[i] + operation);
        }
        System.out.print(result);
    }

    public static void delete() {
        double[] realNumbers = new double[15];
        int length = realNumbers.length;
        for (int i = 0; i < length; i++) {
            realNumbers[i] = Math.random();
        }
        printArrayInTwoLines(realNumbers);
        int avIndex = length / 2;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (realNumbers[i] > realNumbers[avIndex]) {
                realNumbers[i] = 0;
                counter++;
            }
        }
        printArrayInTwoLines(realNumbers);
        System.out.print("Количество обнуленных ячеек: " + counter);
    }

    public static void printTheAlphabet() {
        char[] letters = new char[26];
        int length = letters.length;
        for (int i = 0; i < length; i++) {
            letters[i] = (char) (65 + i);
        }
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letters[length - 1 - j]);
            }
            if (i != 0) {
                System.out.println();
            }
        }
    }

    public static void fillAnArrayWithUniqueNumbers() {
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;
        for (int i = 0; i < length; i++) {
            boolean isUnique;
            do {
                uniqueNumbers[i] = (int) (Math.random()*(100 - 60)) + 60;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[i] == uniqueNumbers[j]) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
        }
        int temp;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    temp = uniqueNumbers[j];
                    uniqueNumbers[j] = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(uniqueNumbers[i] + " ");
        }
    }

    private static void printArray(int[] array) {
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
    private static void printArrayInTwoLines(double[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == 0){
                System.out.printf("%5d%s",(int) array[i], " ");
            } else {
                System.out.printf("%.3f%s", array[i], " ");
            }
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
