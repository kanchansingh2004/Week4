package com.largefilereader;

public class Main {
    public static void main(String[] args) {
        // Specify the file path for the large file
        String filePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\largefilereader\\inputfile.txt";

        // Create an instance of LargeFileReader
        LargeFileReader fileReader = new LargeFileReader(filePath);

        // Call the method to process the file
        fileReader.processFile();
    }
}
