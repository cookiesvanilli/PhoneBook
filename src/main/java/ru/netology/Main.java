package ru.netology;

public class Main {
    public static void main(String[] args) {
        System.out.println(PhoneBook.add("Maria", 9731231223L));
        System.out.println(PhoneBook.add("Katya", 9234233432L));
        System.out.println(PhoneBook.add("Kolya", 9999999999L));
        System.out.println(PhoneBook.findByNumber(9999999999L));
        System.out.println(PhoneBook.findByName("Maria"));
        System.out.println("---------");
        PhoneBook.printAllNames();

    }
}