

import java.util.Map;

import Exception.FileOperationException;
import Exception.InvalidContactException;
import File.FileHelper;
import Model.Contact;
import Validation.ContactValidator;
import Сonsole.ConsoleHelper;

public class PhoneBookApp {
    public static void main(String[] args) {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        Map<String, Contact> phoneBook = consoleHelper.getContactsFromUser();

        for (Contact contact : phoneBook.values()) {
            try {
                ContactValidator.validate(contact);
            } catch (InvalidContactException e) {
                System.out.println("Ошибка валидации контакта: " + e.getMessage());
            }
        }

        // Печать разделителя и вывод контактов
        System.out.println("=========================");
        consoleHelper.displayContacts(phoneBook);

        try {
            FileHelper.saveContactsToFile("phonebook.txt", phoneBook);
        } catch (FileOperationException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
