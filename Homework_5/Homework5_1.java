package Homework_5;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class Homework5_1
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Петров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Игнатов", List.of("+7(977)131-21-11", "+7(495)222-22-22"));
        phoneBook.put("Вязов", List.of("+7(901)323-31-32", "+7(967)444-42-44"));
        phoneBook.put("Сидоров",List.of("+7(987)565-55-55", "+7(905)766-76-66"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
