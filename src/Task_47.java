// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
//m = 3, n = 4.
//0,5 7 -2 -0,2
//1 -3,3 8 -9,9
//8 7,8 -7,1 9

import java.util.Scanner;

public class Task_47 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите m: ");
        int m = s.nextInt();
        System.out.println("Введите n: ");
        int n = s.nextInt();
        double[][] array = new double[m][n];
        double max = 100;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
