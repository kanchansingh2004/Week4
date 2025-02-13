package com.largefilereader;

import java.io.*;

// Class for reading and processing a large file
public class LargeFileReader {
    private final String filePath;

    // Constructor to initialize file path
    public LargeFileReader(String filePath) {
        this.filePath = filePath;
    }

    // Method to read file line by line and print lines containing "error"
    public void processFile() {
        // Try-with-resources to ensure BufferedReader is closed properly
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line contains the word "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    // Print the line if it contains the word "error"
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            // Print an error message if an exception occurs
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
