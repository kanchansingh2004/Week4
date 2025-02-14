package com.trywithresource;
//Import required packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        //Store the files path in variables
        String filePath1 = "D:\\Training_Capgemini\\Week4\\Day4\\src\\main\\java\\com\\trywithresource\\info.txt";
        String filePath2 = " ";
        String line;
        //Create try and catch block to handle exception for filePath1
        try{
            FileReader fileReader = new FileReader(filePath1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            System.out.println(line);
            //Display message
            System.out.println("Successfully read the filePath1!!!!");
        }catch (IOException e){
            System.out.println("Error reading filePath1");
        }
        System.out.println("================================================");

        //Create try and catch block to handle exception for filePath2
        try{
            FileReader fileReader = new FileReader(filePath2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            System.out.println(line);
            //Display message
            System.out.println("Successfully read the filePath2!!!!");
        }catch (IOException e){
            System.out.println("Error reading filePath2");
        }
    }
}
