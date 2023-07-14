package Java.Java;

import java.util.ArrayList;
import java.util.List;

public class ex_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);
        numbers.add(1);
        numbers.add(8);

        // Удаление четных чисел
        List<Integer> oddNumbers = removeEvenNumbers(numbers);
        System.out.println("Список после удаления четных чисел: " + oddNumbers);

        // Поиск минимального значения
        int min = findMinimum(oddNumbers);
        System.out.println("Минимальное значение: " + min);

        // Поиск максимального значения
        int max = findMaximum(oddNumbers);
        System.out.println("Максимальное значение: " + max);

        // Поиск среднего значения
        double average = findAverage(oddNumbers);
        System.out.println("Среднее значение: " + average);
    }

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static int findMinimum(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMaximum(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double findAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
