package com.listinterface;

import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> wordList = new ArrayList<>();
        wordList.add("Yo");
        wordList.add("Yo");
        wordList.add("lo");
        wordList.add("No");
        wordList.add("Yo");
        wordList.add("lo");
        wordList.add("Yo");
        wordList.add("lo");

        // Counting frequency of each word
        Map<String, Integer> frequencyMap = countFrequency(wordList);

        // Printing the frequency map
        System.out.println(frequencyMap);
    }

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterating through the list and updating frequency
        for (String val : list) {
            frequencyMap.put(val, frequencyMap.getOrDefault(val, 0) + 1);
        }
        return frequencyMap;
    }
}
