package com.readuserinput;

import java.io.*;

public class ReadUserInputFromConsole {
    public static void main(String[] args) {
        //Variable to store file path
        String filePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\readuserinput\\UserInputFile.txt";
        String line = "";
        //Try and catch block to handle any I/O exception
        try{
            //Take input from console and write in a file
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            FileWriter file=new FileWriter(filePath);

            System.out.print("Enter your name : ");
            String name= reader.readLine();

            System.out.print("Enter your age : ");
            String age=reader.readLine();

            System.out.print("Enter your favourite programming language : ");
            String language=reader.readLine();

            String date="Name: "+name+"\nAge: "+age+"\nFavourite Language: "+language;
            file.write(date);
            file.flush();

            //Display the message
            System.out.println("Successfully written to the text file!!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
