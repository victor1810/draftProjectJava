import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        // Найти сумму цифр шестизначного числа
        // Пример: Число 123456. Ответ - 21
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int length = (int) Math.log10(number) + 1;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа -> " + sum);
    }
}
