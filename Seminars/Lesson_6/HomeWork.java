package Seminars.Lesson_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

        addNumber("Sokolov", 123, phoneBook);
        addNumber("Sokolov", 1234, phoneBook);
        addNumber("Petrov", 546585, phoneBook);
        addNumber("Petrov", 787897, phoneBook);
        addNumber("Kuznezov", 8956477, phoneBook);
        addNumber("Sokolov", 12356233, phoneBook);

        HashMap<String, ArrayList<Integer>> nonDuplicatePhoneBook = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            if (!nonDuplicatePhoneBook.containsKey(entry.getKey())) {
                nonDuplicatePhoneBook.put(entry.getKey(), entry.getValue());
            }
        }

        List<Map.Entry<String, ArrayList<Integer>>> list = new ArrayList<>(nonDuplicatePhoneBook.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        for (Map.Entry<String, ArrayList<Integer>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}