/* Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве,
и возвращает значение этого элемента или же указание, что такого элемента нет.
Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
17 -> такого числа в массиве нет */

import java.util.Random;
import java.util.Scanner;

public class Task_50 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(3, 21);
        int n = random.nextInt(3, 21);
        int[][] array = new int[m][n];
        System.out.println("m -> " + m + ", n -> " + n);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100, 1000);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер строки:");
        int numStr = scanner.nextInt();
        System.out.println("Введите номер столбца:");
        int numRow = scanner.nextInt();
        if (numStr > m || numRow > n) {
            System.out.println("Такого элемента нет");
        } else {
            System.out.println("Заданный элемент -> " + array[--numStr][--numRow]);
        }
    }
}
