package Validation;

import Exception.InvalidContactException;
import Model.Contact;

public class ContactValidator {
    public static void validate(Contact contact) throws InvalidContactException {
        if (contact.getName() == null || contact.getName().isEmpty()) {
            throw new InvalidContactException("Имя не может быть пустым");
        }
        for (String phone : contact.getPhoneNumbers()) {
            if (!phone.matches("\\d+")) {
                throw new InvalidContactException("Номер телефона должен содержать только цифры: " + phone);
            }
        }
    }
}
