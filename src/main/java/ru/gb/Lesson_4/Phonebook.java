package ru.gb.Lesson_4;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> storage;

    public Phonebook() {
        storage = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (storage.containsKey(surname)) {
            ArrayList<String> phones = storage.get(surname);
            phones.add(phone);
        } else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            storage.put(surname, phones);
        }
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> phones = storage.get(surname);
        if (phones != null) {
            return phones;
        } else {
            return new ArrayList<>();
        }

    }
}
