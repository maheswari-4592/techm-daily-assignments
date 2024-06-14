package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Maximum {
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(10, 125, 30, 42, 53);

        // Finding the maximum element using Stream API
        int maxElement = numbers.stream()
                .max(Integer::compare)
                .orElseThrow(); // If list is empty, the exception is thrown

       System.out.println("Maximum Element : " + maxElement);
    }
}
