package ru.gb.Lesson_4;

import java.util.HashMap;

public class App1 {
    public static void main(String[] args) {
        String[] words = {
                "плакат",
                "трава",
                "дверь",
                "труд",
                "апельсин",
                "плакат",
                "собака",
                "труд",
                "полка",
                "система",
                "учитель",
                "трава",
                "плакат",
                "стрела",
                "трава",
                "плакат",
                "полка",
                "шар",
                "объект",
                "труд",
                "полка",
                "рябина",
                "плакат",
                "трава",
        };

        HashMap<String, Integer> map = new HashMap<>();

        for (String word: words) {
            int count = map.getOrDefault(word, 0);
            map.put(word, count + 1);
        }

        System.out.println("Список уникальных слов: " + map.keySet());
        System.out.println("Количество вхождений:" + map);
    }
}
