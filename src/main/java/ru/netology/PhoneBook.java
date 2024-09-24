package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static HashMap<String, Long> phonebook = new HashMap<>();

    public static int add(String name, long number) {
        phonebook.put(name, number);
        return phonebook.size();
    }

    public static String findByNumber(long number) {
        return phonebook.entrySet()
                .stream()
                .filter(v -> v.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

}
