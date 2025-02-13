package com.bytestreams;

import java.io.*;

public class ByteStreamsMain {
    public static void main(String[] args) {
        // File paths for input and output
        String inputFilePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\bytestreams\\text1.txt";
        String outputFilePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\bytestreams\\text2.txt";

        try (
                // Initialize FileReader and BufferedReader to read the input file
                FileReader fr = new FileReader(inputFilePath);
                BufferedReader br = new BufferedReader(fr);

                // Initialize FileWriter and BufferedWriter to write to the output file
                FileWriter fw = new FileWriter(outputFilePath);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            // Read each line from the input file
            while ((line = br.readLine()) != null) {
                // Convert the line to lowercase and write to the output file
                bw.write(line.toLowerCase());
                bw.newLine(); // Add a new line
            }

            System.out.println("File converted successfully: Uppercase to Lowercase");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

