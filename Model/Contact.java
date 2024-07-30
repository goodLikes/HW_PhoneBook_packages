package Model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<String> phoneNumbers;

    public Contact(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }
}
