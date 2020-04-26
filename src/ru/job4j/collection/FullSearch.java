package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<TaskSet> list) {
        HashSet<String> numbers = new HashSet<>();
        for (TaskSet element: list) {
                numbers.add(element.getNumber());
        }
        return numbers;
    }
}