package com.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Creating an ArrayList and adding elements
        List<Integer> originalList = new ArrayList<>();
        originalList.add(4);
        originalList.add(2);
        originalList.add(3);
        originalList.add(7);
        originalList.add(1);
        originalList.add(9);

        // Printing the original list
        System.out.println("Original List: " + originalList);

        // Reversing using ArrayList
        List<Integer> reversedArrayList = reverseUsingArrayList(originalList);
        System.out.println("Reversed (ArrayList): " + reversedArrayList);

        // Reversing using LinkedList
        List<Integer> reversedLinkedList = reverseUsingLinkedList(originalList);
        System.out.println("Reversed (LinkedList): " + reversedLinkedList);
    }

   //Reverses a list and stores the result in an ArrayList.
    private static List<Integer> reverseUsingArrayList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();

        // Iterate the list in reverse order and add elements to new list
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    // * Reverses a list and stores the result in a LinkedList.
    private static List<Integer> reverseUsingLinkedList(List<Integer> list) {
        List<Integer> reversedList = new LinkedList<>();

        // Iterate the list in reverse order and add elements to new list
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
