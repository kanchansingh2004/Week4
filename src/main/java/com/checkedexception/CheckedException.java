package com.checkedexception;
//Import the packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        //Store the files path
        String filePath1 = "D:\\Training_Capgemini\\Week4\\Day4\\src\\main\\java\\com\\checkedexception\\data.txt";
        String filePath2 = "data2.txt";
        String line = "";

        try{
            //Read the first file using file and buffered reader and output the data
            System.out.println("Reading data file 1");
            FileReader reader = new FileReader(filePath1);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("Successfully read the file data!!");

            //Read the second file using file and buffered reader and output the data
            System.out.println("\n\nReading data file 2");
            FileReader reader1 = new FileReader(filePath2);
            BufferedReader bufferedReader1 = new BufferedReader(reader1);
            while((line = bufferedReader1.readLine())!=null){
                System.out.println(line);
            }

            System.out.println("Successfully read the file data!!");

        }catch (IOException e){
            //Output message if file not found
            System.out.println("File not found!!");
        }
    }
}
