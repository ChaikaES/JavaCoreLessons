package ru.gb.Lesson_4;

public class App2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "89423234241");
        phonebook.add("Петров", "89423234242");
        phonebook.add("Иванов", "89423234243");

        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Сидоров"));
    }
}
