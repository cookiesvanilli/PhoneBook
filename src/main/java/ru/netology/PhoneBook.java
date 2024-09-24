package ru.netology;

import java.util.HashMap;

public class PhoneBook {
    public static HashMap<String, Long> phonebook = new HashMap<>();

    public static int add(String name, long number) {
        phonebook.put(name, number);
        return phonebook.size();
    }
}
