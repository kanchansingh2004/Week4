package com.customexception;
//Import the scanner class
import java.util.Scanner;

public class InvalidAgeException extends Throwable {
    public static void main(String[] args) {
        //Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        try {
            //Take age as user input
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            //Method call to check the validity
            validAge(age);
        }catch (InvalidAgeException e){
            //Catch the invalid age exception
            System.out.println("Age must be 18 or above!!!");
        }

    }

    //Method to throw exception if age is below 18 else display the message
    public static void validAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException();
        }
        else{
            System.out.println("Access Granted!!");
        }
    }
}
