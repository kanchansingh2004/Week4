package com.nestedtrycatch;

public class NestedTryBatchBlock {
    public static void main(String[] args) {
        //Create sample array, with divisor and index
        int[] array = {1,2,3,4,5,6};
        int divisor = 0;
        int index = 5;

        //Method call to handle exception if any
        nestedTryCatch(array, divisor, index);
    }

    //Method to handle exception using nested try and catch block
    public static void nestedTryCatch(int[] array, int divisior, int index) {
        //Outer try
        try{
            //Inner try1
            try {
                //Inner try2
                try {
                    System.out.println(array[index]/divisior);
                } catch (ArithmeticException e) {
                    //Display Message
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                //display message
                System.out.println("Invalid array index!");
            }
        }finally {
            System.out.println("Successful execution");
        }
    }
}
