package com.streamAPI;
import java.util.Arrays;

public class Sum 
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 5, 3, 4, 5};

        // Creating a stream of integers from the array
        int sum = Arrays.stream(numbers).sum();

        System.out.println("The sum of all elements: " + sum);
    }
}
