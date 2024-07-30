package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import Exception.FileOperationException;
import Model.Contact;

public class FileHelper {
    public static void saveContactsToFile(String filename, Map<String, Contact> phoneBook) throws FileOperationException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Contact contact : phoneBook.values()) {
                writer.write(contact.getName() + ": " + contact.getPhoneNumbers());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new FileOperationException("Ошибка записи в файл", e);
        }
    }

    public static Map<String, Contact> loadContactsFromFile(String filename) throws FileOperationException {
        // Реализовать метод для чтения из файла, если необходимо
        return null;
    }
}
