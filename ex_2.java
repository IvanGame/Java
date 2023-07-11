package Java.Java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex_2 {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 12, 1 };

        // Путь к лог-файлу
        String logFilePath = "java/java/log.txt";

        try {
            // Создание объекта FileWriter с использованием пути к лог-файлу
            FileWriter fileWriter = new FileWriter(logFilePath);

            // Создание объекта BufferedWriter для записи в файл
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Запись исходного массива в лог-файл
            writeArrayToLogFile(array, bufferedWriter);

            // Сортировка пузырьком
            bubbleSort(array, bufferedWriter);

            // Закрытие BufferedWriter
            bufferedWriter.close();

            System.out.println("Сортировка завершена. Результаты записаны в лог-файл: " + logFilePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в лог-файл: " + e.getMessage());
        }
    }

    // Метод для записи массива в лог-файл
    private static void writeArrayToLogFile(int[] array, BufferedWriter bufferedWriter) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : array) {
            stringBuilder.append(num).append(" ");
        }
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.newLine();
    }

    // Метод для обмена двух элементов массива
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Метод для сортировки пузырьком
    private static void bubbleSort(int[] array, BufferedWriter bufferedWriter) throws IOException {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }

            // Запись промежуточного состояния массива в лог-файл
            writeArrayToLogFile(array, bufferedWriter);

            // Если в текущей итерации не было перестановок, то массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }
}
