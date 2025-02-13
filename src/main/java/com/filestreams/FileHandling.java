package com.filestreams;
//Import packages
import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        //Variable to store the file path
        String inputFilePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\filestreams\\InputText.txt";
        String outputFilePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\filestreams\\OutputText.txt";
        int line;

        //Try catch block to handle the exception if file does not exist
        try{
            //Create file input and output stream
            FileInputStream fileInputStream = new FileInputStream(inputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
            line = fileInputStream.read();
            //Loop Through each line
            while(line != -1){
                fileOutputStream.write(line);
                line = fileInputStream.read();
            }

            //Display the message
            System.out.println("File copied successfully.");

        }catch (IOException e){
            System.out.println("The source file does not exist");
        }
    }
}
