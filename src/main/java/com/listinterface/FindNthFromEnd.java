package com.listinterface;

import java.util.*;

public class FindNthFromEnd {
    public static void main(String[] args) {
        // Sample LinkedList
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        // Finding the Nth element from the end
        String result = findNthFromEnd(list, n);

        // Printing the result
        System.out.println(result);
    }

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        // Move first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return null; // Handle case where N > list size
            first.next();
        }

        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // The Nth element from the end
    }
}

