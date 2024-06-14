package com.lambdaexpressions;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        String[] names = {"Alce", "Bob", "Charlie"};

        // Sorting the array of strings in descending order using lambda expression
        Arrays.sort(names, (s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted Array in Descending Order:");
        for (String name : names) {
            System.out.println(name);
            
            
         // Sorting the array of strings in ascending order using lambda expression
            Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));

        }
    }
}
