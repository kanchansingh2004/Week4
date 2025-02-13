package com.wordcounter;

public class Main {
    public static void main(String[] args) {
        // Specify the file path for the text file
        String filePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\wordcounter\\input.txt";

        // Create an instance of WordCounter
        WordCounter wordCounter = new WordCounter(filePath);

        // Call the method to count words and display results
        wordCounter.countWords();
    }
}
