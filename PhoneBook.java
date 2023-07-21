package Java.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addPhoneNumber(String name, String phoneNumber) {
        contacts.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    public void removePhoneNumber(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.get(name);
        if (phoneNumbers != null) {
            phoneNumbers.remove(phoneNumber);
            if (phoneNumbers.isEmpty()) {
                contacts.remove(name);
            }
        }
    }

    public List<String> getPhoneNumbers(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }

    public Map<String, List<String>> getAllContacts() {
        return contacts;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhoneNumber("Иван Иванов", "123-456-7890");
        phoneBook.addPhoneNumber("Иван Иванов", "987-654-3210");

        phoneBook.addPhoneNumber("Андрей Петров", "553-456-7555");

        List<String> IvanIvanovPhones = phoneBook.getPhoneNumbers("Иван Иванов");
        System.out.println("Иван Иванов телефоны: " + IvanIvanovPhones);

        List<String> AndrewPetrovPhones = phoneBook.getPhoneNumbers("Андрей Петров");
        System.out.println("Андрей Петров телефоны: " + AndrewPetrovPhones);

        phoneBook.removePhoneNumber("Иван Иванов", "123-456-7890");
        System.out.println("Иван Иванов телефоны после удаления: " + phoneBook.getPhoneNumbers("Иван Иванов"));

        System.out.println("Все контакты: " + phoneBook.getAllContacts());
    }
}
