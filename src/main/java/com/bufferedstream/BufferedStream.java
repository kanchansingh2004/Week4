package com.bufferedstream;
//Import packages

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) {
        //Variable to store the file path
        String inputFilePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\bufferedstream\\InputText.txt";
        String outputBufferedFilePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\bufferedstream\\OutputText.txt";
        String outputFilePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\bufferedstream\\OutputFilePath";
        bufferedStreamPerformance(inputFilePath, outputBufferedFilePath);
        fileStreamPerformance(inputFilePath, outputFilePath);
    }

    public static void fileStreamPerformance(String inputFilePath, String outputFilePath){
        int line;
        //Try catch block to handle the exception if file does not exist
        try{
        //Create file input and output stream
        FileInputStream fileInputStream = new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
        line = fileInputStream.read();
        double startTime= System.nanoTime();
        //Loop Through each line
        while(line != -1){
            fileOutputStream.write(line);
            line = fileInputStream.read();
        }

        double endTime = System.nanoTime();
        //Display the time taken
        System.out.println("File copied successfully.");
        System.out.println("Time taken by file streams: " + (endTime-startTime));


        }catch (IOException e){
            System.out.println("The source file does not exist");
        }
    }

    public static void bufferedStreamPerformance(String inputFilePath, String outputFilePath) {
        try{
            //Create file input and output stream
            FileInputStream fileInputStream = new FileInputStream(inputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //Specifying the size for the chunks
            byte[] buffer = new byte[4096];

            int bytesRead;

            //calculate Start and end time of buffered streams to measure its performance
            double startTime  = System.nanoTime();
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }
            double endTime = System.nanoTime();

            //Display the time taken
            System.out.println("File copied successfully with buffering.");
            System.out.println("Time taken by buffered streams: " + (endTime-startTime));
        }catch (IOException e){
            System.out.println("File copied successfully.");
        }
    }
}
