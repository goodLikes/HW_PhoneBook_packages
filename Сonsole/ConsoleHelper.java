package Сonsole;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Model.Contact;

public class ConsoleHelper {
    private Scanner scanner;

    public ConsoleHelper() {
        scanner = new Scanner(System.in);
    }

    public Map<String, Contact> getContactsFromUser() {
        Map<String, Contact> phoneBook = new HashMap<>();
        System.out.println("Введите контакты (имя и номер телефона). Для завершения введите 'exit':");

        while (true) {
            System.out.print("Имя: ");
            String name = scanner.nextLine().trim();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Номер телефона: ");
            String phone = scanner.nextLine().trim();

            if (!phone.matches("\\d+")) {
                System.out.println("Номер телефона должен содержать только цифры. Попробуйте снова.");
                continue;
            }

            Contact contact = phoneBook.getOrDefault(name, new Contact(name));
            contact.addPhoneNumber(phone);
            phoneBook.put(name, contact);
        }

        return phoneBook;
    }

    public void displayContacts(Map<String, Contact> phoneBook) {
        phoneBook.values().stream()
            .sorted((c1, c2) -> Integer.compare(c2.getPhoneNumbers().size(), c1.getPhoneNumbers().size()))
            .forEach(contact -> {
                System.out.println("Имя: " + contact.getName());
                System.out.println("Телефоны: " + contact.getPhoneNumbers());
            });
    }
}
