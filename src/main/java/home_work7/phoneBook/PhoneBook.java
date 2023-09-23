package home_work7.phoneBook;

import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook = new HashMap<>();

    Set<String> setPhoneNumbers = new HashSet<>();

    public PhoneBook() {
    }

    public void addUserPhone(String fio, String phoneNumber) {
        if (!phoneBook.containsKey(fio)) {
            List<String> listNumbers = new ArrayList<>();
            listNumbers.add(phoneNumber);
            phoneBook.put(fio, listNumbers);
            setPhoneNumbers.add(phoneNumber);
        } else {
            phoneBook.get(fio).add(phoneNumber);
            setPhoneNumbers.add(phoneNumber);
        }
    }

    public List<String> findUserNumbers(String fio) {
        return phoneBook.get(fio);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        return setPhoneNumbers.contains(phoneNumber);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
