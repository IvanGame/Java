package Java.Java;

class Cat {
    private String name;
    private int age;
    private String ownerName;

    // Конструктор класса Cat
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод доступа для поля "имя" (name)
    public String getName() {
        return name;
    }

    // Метод установки значения для поля "имя" (name)
    public void setName(String name) {
        this.name = name;
    }

    // Метод доступа для поля "возраст" (age)
    public int getAge() {
        return age;
    }

    // Метод установки значения для поля "возраст" (age)
    public void setAge(int age) {
        this.age = age;
    }

    // Метод доступа для поля "имя владельца" (ownerName)
    public String getOwnerName() {
        return ownerName;
    }

    // Метод установки значения для поля "имя владельца" (ownerName)
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Метод приветствия
    public void greet() {
        String greeting = "Мяу! Меня зовут " + name + ". Мне " + age + " года.";
        if (ownerName != null) {
            greeting += " Мой владелец - " + ownerName + ".";
        }
        System.out.println(greeting);
    }
}

class Owner {
    private String name;

    // Конструктор класса Owner
    public Owner(String name) {
        this.name = name;
    }

    // Метод доступа для поля "имя" (name)
    public String getName() {
        return name;
    }

    // Метод установки значения для поля "имя" (name)
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3);
        cat1.greet();

        Owner owner1 = new Owner("Иван");
        cat1.setOwnerName(owner1.getName());
        cat1.greet();
    }
}
