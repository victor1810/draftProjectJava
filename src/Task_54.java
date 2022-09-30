/* Задача 54: Задайте двумерный массив. Напишите программу,
которая упорядочит по убыванию элементы каждой строки двумерного массива.
Например, задан массив:
 1 4 7 2
 5 9 2 3
 8 4 2 4
В итоге получается вот такой массив:
 7 4 2 1
 9 5 3 2
 8 4 4 2  */

import java.util.Random;

public class Task_54 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(3, 9);
        int n = random.nextInt(3, 9);
        int[][] array = new int[m][n];
        System.out.println("m = " + m + ", n = " + n + "\n");
        System.out.println("Несортированный массив");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 999);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Отсортированный масив");
        int max = array[0][0];
        int min = array[0][0];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(max < array[i][j]){
                    max = array[i][j];
                }
                else if(min > array[i][j]) {
                    min = array[i][j];
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
