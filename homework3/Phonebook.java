package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров

class Phonebook {

    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String surname, String phonenumber) {
        HashSet<String> numbers;

        if (map.containsKey(surname)) {
            numbers = map.get(surname);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phonenumber);
        map.put(surname, numbers);

    }

    Set<String> get(String surname) {
        return map.get(surname);
    }
}
