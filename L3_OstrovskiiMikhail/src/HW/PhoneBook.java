package HW;

import java.util.*;

class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();
    private List<String> phoneNumbers;

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(number);
            phoneBook.put(name, phoneNumbers);
        } else {
            phoneNumbers = new ArrayList<>();
            phoneNumbers.add(number);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public List<String> get(String name) {
        return phoneBook.get(name);
    }

}