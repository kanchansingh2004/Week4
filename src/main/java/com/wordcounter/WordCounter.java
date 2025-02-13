package com.wordcounter;

import java.io.*;
import java.util.*;

// Class to process the file and count word frequencies
public class WordCounter {
    private final String filePath;

    // Constructor to initialize file path
    public WordCounter(String filePath) {
        this.filePath = filePath;
    }

    // Method to count words and display the top 5 most frequent ones
    public void countWords() {
        // HashMap to store word frequencies
        Map<String, Integer> wordCounts = new HashMap<>();

        // Try-with-resources to ensure BufferedReader is closed properly
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words using spaces and punctuation as delimiters
                String[] words = line.toLowerCase().split("[\\s\\p{Punct}]+");
                for (String word : words) {
                    // Skip empty words
                    if (!word.isEmpty()) {
                        // Update the count for each word
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort the words by their frequency in descending order
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
            sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            // Display the total word count
            System.out.println("Total words: " + wordCounts.values().stream().mapToInt(Integer::intValue).sum());

            // Display the top 5 most frequently occurring words
            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWords.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            // Print an error message if an exception occurs
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
