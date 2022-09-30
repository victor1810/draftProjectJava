/* Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами.
Напишите программу, которая покажет количество чётных чисел в массиве.
[345, 897, 568, 234] -> 2  */

import java.util.Random;

public class Task_34 {
    public static void main(String[] args) {
        Random random = new Random();
        int even = 0;
        int arr = random.nextInt(3, 20);
        int[] array = new int[arr];
        System.out.println("Array size -> " + arr);
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100, 1000);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0){
                even ++;
            }

        }
        System.out.println("] -> " + even);

    }
}
