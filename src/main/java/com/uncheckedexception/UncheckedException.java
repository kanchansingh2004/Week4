package com.uncheckedexception;
//Import required packages
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        //Create scanner class object to take user input
        Scanner sc = new Scanner(System.in);
        try{
            //Take two number from user as input
            System.out.println("Enter the first number: ");
            int first = sc.nextInt();
            System.out.println("Enter the second number: ");
            int second = sc.nextInt();
            //Store the result in a variable and display
            int result = first/second;
            System.out.println("The result of dividing first and second number is: " + result);
        }catch (ArithmeticException e){
            //Catch the arithmetic exception
            System.out.println("Entered 0 as the denominator. Arithmetic exception handled");
        }catch (InputMismatchException e){
            //Catch the input mismatch exception
            System.out.println("Non numeric value entered. InputMismatchException handled");
        }
    }
}
