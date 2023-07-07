package Java;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("Введите число: ");
            int number = iScanner.nextInt();
            int sum = 0;
            int mult = 1;
            for (int i = 1; i <= number; i++) {
                sum += i;
                mult = mult * i;
            }
            System.out.printf("Треугольное число равно: %d\n", sum);
            System.out.printf("Факториал числа %d равен: %d", number, mult);
        }
    }
}
