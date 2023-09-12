package home_work7;

import home_work7.phoneBook.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addUserPhone("Evlanov Ivan Vladimirovich", "8918111111");
        phoneBook.addUserPhone("Evlanov Ivan Vladimirovich", "8918111112");
        phoneBook.addUserPhone("Evlanov Ivan Vladimirovich", "8918111113");
        phoneBook.addUserPhone("Evlanov Ivan Vladimirovich", "8918111114");
        phoneBook.addUserPhone("Logvinenko Maks Genadevich", "8198222222");
        phoneBook.addUserPhone("Logvinenko Maks Genadevich", "8198222223");
        phoneBook.addUserPhone("Logvinenko Maks Genadevich", "8198222224");
        phoneBook.addUserPhone("Shelepneva Polina Yrievna", "8198333333");
        System.out.println(phoneBook);

        System.out.println(phoneBook.findUserNumbers("Logvinenko Maks Genadevich"));

        phoneBook.containsPhoneNumber("8918111111");

        Set<Integer> testSet = new HashSet<>();
        testSet.add(1);
        testSet.add(1);
        testSet.add(1);
        testSet.add(3);
        phoneBook.containsPhoneNumber("8918111110");
    }
}
