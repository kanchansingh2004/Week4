package com.exceptionpropagation;
//Import scanner class
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //Create object of scanner class
        Scanner sc = new Scanner(System.in);

        //Take two numbers as user input
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        //Use try catch block t o handle exception
        try {
            method2(first, second);
        }catch(ArithmeticException e){
            System.out.println("Handled exception in main!");
        }
    }

    //method to throw exception
    public static void method1(int first, int second) {
        if(second == 0){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Result is: " + (first/second));
        }
    }

    //Method to call method1 which throw exception
    public static void method2(int first, int second) {
        method1(first,second);
    }
}
