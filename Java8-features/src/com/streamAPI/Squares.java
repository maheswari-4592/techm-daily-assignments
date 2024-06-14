package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Squares 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(1, 6, 3, 4, 5);

        // Mapping the list of integers to their squares using the Stream API
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .toList();


        System.out.println("Squares: " + squares);
    }
}
