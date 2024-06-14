package com.lambdaexpressions;

import java.util.Arrays;

public class SumOfSquares 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculating the sum of squares of elements using lambda expressions
        int sumOfSquares = Arrays.stream(numbers)
                .map(num -> num * num)
                .sum();

        System.out.println("The sum of squares  " + sumOfSquares);
    }
}
