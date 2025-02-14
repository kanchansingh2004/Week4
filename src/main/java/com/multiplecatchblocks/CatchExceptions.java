package com.multiplecatchblocks;

public class CatchExceptions {
    public static void main(String[] args) {
        //Initialize array as null and provide index
        int[] array1 = null;
        int index = 5;
        //Method call for NullPointerException
        System.out.println("Method calling for array 1");
        checkTheException(array1,index);

        //Initialize array with elements and call method for ArrayIndexOutOfBoundsException
        System.out.println("\nMethod calling for array 2");
        int[] array2 = {1,2,3,4};
        checkTheException(array2,index);
    }

    //Method to check to handle the exception
    private static void checkTheException(int[] array1, int index) {
        try{
            System.out.println("Value at "+index+": "+array1[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            //Display message
            System.out.println("Invalid Index!!");
        }catch (NullPointerException e){
            //Display message
            System.out.println("Array is not initialized!!");
        }
    }
}
