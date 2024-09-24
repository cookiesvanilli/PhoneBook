package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

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

    public static long findByName(String name) {
        return phonebook.get(name);
    }

    public static void printAllNames() {
        Map<String, Long> sortedMap = new TreeMap<>(phonebook);
        sortedMap.keySet().forEach(System.out::println);
    }

}
