package com.throwandthrows;

public class UsingThrowAndThrows {
    public static void main(String[] args) {
        //Create variable to store values
        double amount = 130000;
        double rate = -10.5;
        int year = 3;
        //Write try and catch block to handle the exception
        try{
        calculateInterest(amount, rate, year);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }

    //Method to generate exception if rate or amount is negative
    public static void calculateInterest(double amount, double rate, int year) throws IllegalArgumentException {
        if (rate < 0 || amount < 0) {
            //throw exception
            throw new IllegalArgumentException();
        } else {
            //Display the interest
            System.out.println("Calculated Interest is: " + (amount * rate * year) / 100);
        }
    }
}
