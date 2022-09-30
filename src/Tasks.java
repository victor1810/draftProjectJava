public class Tasks {
    public static void main(String[] args) {
        // Найти сумму цифр шестизначного числа
        // Пример: Число 123456. Ответ - 21
        int number = 123456;
        int sum = 0;
        for(int i = 0; i < 6; i++){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
