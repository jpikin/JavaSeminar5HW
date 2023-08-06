package org.example.task1;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> string = List.of(sc.nextLine().toLowerCase().split(" "));
        System.out.println(getStringIntegerMap(string));
    }

    /**
     * @apiNote Подсчитать количество вхождения каждого слова
     * @param string Список слов
     * @return Подсчет вхождения каждого слова
     */
    private static Map<String, Integer> getStringIntegerMap(List<String> string) {
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < string.size(); i++) {
            if (!words.containsKey(string.get(i))) {
                words.put(string.get(i), 1);
            } else {
                words.put(string.get(i), words.get(string.get(i))+1);
            }
        }
        return words;
    }
}