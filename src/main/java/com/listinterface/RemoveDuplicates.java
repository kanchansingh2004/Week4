package com.listinterface;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Sample list with duplicates
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Removing duplicates while maintaining order
        List<Integer> uniqueList = removeDuplicates(numbers);

        // Printing result
        System.out.println(uniqueList);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>(list); // Maintains insertion order
        return new ArrayList<>(seen);
    }
}

