package Java.Java;

import java.util.*;

class Ноутбук {
    private String модель;
    private int ОЗУ; // в гигабайтах
    private int объемЖД; // в гигабайтах
    private String операционнаяСистема;
    private String цвет;

    public Ноутбук(String модель, int ОЗУ, int объемЖД, String операционнаяСистема, String цвет) {
        this.модель = модель;
        this.ОЗУ = ОЗУ;
        this.объемЖД = объемЖД;
        this.операционнаяСистема = операционнаяСистема;
        this.цвет = цвет;
    }

    // Геттеры (Getters) для доступа к полям класса
    public String getМодель() {
        return модель;
    }

    public int getОЗУ() {
        return ОЗУ;
    }

    public int getОбъемЖД() {
        return объемЖД;
    }

    public String getОперационнаяСистема() {
        return операционнаяСистема;
    }

    public String getЦвет() {
        return цвет;
    }

    // Метод для вывода информации о ноутбуке
    public void показатьИнформацию() {
        System.out.println("Модель: " + модель);
        System.out.println("ОЗУ: " + ОЗУ + " ГБ");
        System.out.println("Объем ЖД: " + объемЖД + " ГБ");
        System.out.println("Операционная система: " + операционнаяСистема);
        System.out.println("Цвет: " + цвет);
        System.out.println();
    }
}

public class MagazinTehniki {
    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<Ноутбук> ноутбуки = new HashSet<>();
        ноутбуки.add(new Ноутбук("Asus VivoBook", 8, 512, "Windows 10", "Серый"));
        ноутбуки.add(new Ноутбук("Lenovo IdeaPad", 16, 256, "Windows 11", "Синий"));
        ноутбуки.add(new Ноутбук("HP Pavilion", 4, 1000, "Windows 10", "Черный"));
        // Добавьте другие ноутбуки по желанию

        // Вызываем метод для фильтрации и вывода ноутбуков
        фильтроватьНоутбуки(ноутбуки);
    }

    public static void фильтроватьНоутбуки(Set<Ноутбук> ноутбуки) {
        Scanner scanner = new Scanner(System.in);

        // Создаем Map для хранения критериев фильтрации
        Map<Integer, Object> критерииФильтрации = new HashMap<>();
        System.out.println("Введите цифру, соответствующую критерию фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int выбранныйКритерий = scanner.nextInt();

        switch (выбранныйКритерий) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ (в ГБ): ");
                int озу = scanner.nextInt();
                критерииФильтрации.put(1, озу);
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД (в ГБ): ");
                int объемЖД = scanner.nextInt();
                критерииФильтрации.put(2, объемЖД);
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                String операционнаяСистема = scanner.next();
                критерииФильтрации.put(3, операционнаяСистема);
                break;
            case 4:
                System.out.print("Введите цвет ноутбука: ");
                String цвет = scanner.next();
                критерииФильтрации.put(4, цвет);
                break;
            default:
                System.out.println("Неверный критерий фильтрации.");
                return;
        }

        // Фильтруем ноутбуки и выводим подходящие
        System.out.println("Результаты фильтрации:");
        for (Ноутбук ноутбук : ноутбуки) {
            boolean подходит = true;
            for (Map.Entry<Integer, Object> entry : критерииФильтрации.entrySet()) {
                int критерий = entry.getKey();
                Object значение = entry.getValue();
                switch (критерий) {
                    case 1:
                        if (ноутбук.getОЗУ() < (int) значение) {
                            подходит = false;
                        }
                        break;
                    case 2:
                        if (ноутбук.getОбъемЖД() < (int) значение) {
                            подходит = false;
                        }
                        break;
                    case 3:
                        if (!ноутбук.getОперационнаяСистема().equals(значение)) {
                            подходит = false;
                        }
                        break;
                    case 4:
                        if (!ноутбук.getЦвет().equals(значение)) {
                            подходит = false;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (подходит) {
                ноутбук.показатьИнформацию();
            }
        }
    }
}
