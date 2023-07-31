package Java.Java;

import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;

    // Конструктор без параметров
    public Rectangle() {
        this.width = 1.0; // Ширина по умолчанию
        this.height = 1.0; // Высота по умолчанию
    }

    // Конструктор с параметрами
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод доступа для свойства "ширина" (width)
    public double getWidth() {
        return width;
    }

    // Метод установки значения для свойства "ширина" (width)
    public void setWidth(double width) {
        this.width = width;
    }

    // Метод доступа для свойства "высота" (height)
    public double getHeight() {
        return height;
    }

    // Метод установки значения для свойства "высота" (height)
    public void setHeight(double height) {
        this.height = height;
    }

    // Метод вычисления площади прямоугольника
    public double calculateArea() {
        return width * height;
    }

    // Метод вычисления периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class Mains {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        // Создание прямоугольника с шириной и высотой по умолчанию
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Данные прямоугольника по умолчанию:");
        System.out.println("Ширина прямоугольника: " + rectangle1.getWidth());
        System.out.println("Высота прямоугольника: " + rectangle1.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter());

        // Создание прямоугольника с заданными значениями ширины и высоты
        System.out.println("Введите ширину прямоугольника:");
        Double a = user_input.nextDouble();
        System.out.println("Введите высоту прямоугольника:");
        Double b = user_input.nextDouble();
        Rectangle rectangle2 = new Rectangle(a, b);
        System.out.println("Ширина прямоугольника: " + rectangle2.getWidth());
        System.out.println("Высота прямоугольника: " + rectangle2.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle2.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle2.calculatePerimeter());
    }
}
