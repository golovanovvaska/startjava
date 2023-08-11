package com.startjava.lesson_2_3_4.array;

public class ArraysTheme {

    public static void main(String[] args) {
        System.out.print("1. Реверс значений массива\n");
        int[] arr1 = {1, 5, 4, 2, 6, 3, 7};
        int[] copyArr1 = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            copyArr1[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = copyArr1[copyArr1.length - 1 - i];
        }
        System.out.print("До реверса: ");
        printArray(copyArr1);
        System.out.print("После реверса: ");
        printArray(arr1);

        System.out.print("\n2. Произведение элементов массива\n");
        int[] arr2 = new int[10];
        for (int i = 0; i <= 9; i++) {
            arr2[i] = i;
        }
        int result = 1;
        for (int i = 1; i < 9; i++) {
            result *= arr2[i];
            String operation = (i == 8) ? " = " : " * ";
            System.out.print(arr2[i] + operation);
        }
        System.out.print(result);

        System.out.print("\n\n3. Удаление элементов массива\n");
        double[] arr3 = new double[15];
        double[] copyArr3 = new double[15];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = Math.random();
            copyArr3[i] = arr3[i];
        }
        int avIndex = arr3.length / 2;
        int counter = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > arr3[avIndex]) {
                arr3[i] = 0;
                counter++;
            }
        }
        printArrayInTwoLines(arr3);
        printArrayInTwoLines(copyArr3);
        System.out.print("Количество обнуленных ячеек: " + counter);

        System.out.println("\n\n4. Вывод алфавита лесенкой\n");
        char[] arr4 = new char[26];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (char) (65 + i);
        }
        for (int i = 0; i <= arr4.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr4[arr4.length - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n\n5. Заполнение массива уникальными числами\n");
        int[] arr5 = new int[30];
        for (int i = 0; i < arr5.length; i++) {
            boolean isUnique;
            do {
                arr5[i] = (int) (Math.random()*(100 - 60)) + 60;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (arr5[i] == arr5[j]) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
        }
        int temp;
        for (int i = arr5.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr5[j] > arr5[j + 1]) {
                    temp = arr5[j];
                    arr5[j] = arr5[j + 1];
                    arr5[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr5.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(arr5[i] + " ");
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.printf(array[i] + ", ");
            }
        }
        System.out.println();
    }
    private static void printArrayInTwoLines(double[] array) {
        for (int i = 0; i < array.length; i++) {
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
