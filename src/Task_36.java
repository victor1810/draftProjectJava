/* Задача 36: Задайте одномерный массив, заполненный случайными числами.
Найдите сумму элементов, стоящих на нечётных позициях.
[3, 7, 23, 12] -> 19
[-4, -6, 89, 6] -> 0 */

import java.util.Random;

public class Task_36 {
    public static void main(String[] args) {
        Random random = new Random();
        int dimension = random.nextInt(3, 20);
        int[] array = new int[dimension];
        System.out.println("Array size -> " + dimension);
        System.out.print("[ ");
        int sumUneven = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100, 1000);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 1){
                sumUneven += array[i];
            }
        }
        System.out.println("] -> " + sumUneven);
    }
}

