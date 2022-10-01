// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
//m = 3, n = 4.
//0,5 7 -2 -0,2
//1 -3,3 8 -9,9
//8 7,8 -7,1 9

import java.util.Random;

public class Task_47 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(3, 10);
        System.out.print("m = " + m + ", ");
        int n = random.nextInt(3, 10);
        System.out.println("n = " + n + ": ");
        double[][] array = new double[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextDouble(100.0);
                System.out.printf("%.2f ", array[i][j]);
            }
            System.out.println();
        }
    }
}

