package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {


        //Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся)
        String[] someWords = {"Home", "Wall", "Window", "Home", "Summer", "Car", "Home", "Cat", "Dog", "Cloud", "Car"};
        //Посчитать, сколько раз встречается каждое слово
        Map<String, Integer> map = new HashMap<>();
        for (String word : someWords) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)
        Set<String> uniqWords = new HashSet<>(Arrays.asList(someWords));
        System.out.println(uniqWords);


        //Телефонный справочник
        Phonebook contacts = new Phonebook();
        contacts.add("Ivanov", "89037693410");
        contacts.add("Ivanov", "89057683511");
        contacts.add("Petrov", "89265550355");
        System.out.println(contacts.get("Ivanov"));
        System.out.println(contacts.get("Petrov"));


    }


}
