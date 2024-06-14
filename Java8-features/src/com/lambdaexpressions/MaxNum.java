package com.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class MaxNum
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(10, 25, 130, 42, 53);

        // Finding the maximum element using lambda expressions
        int maxNumber = numbers.stream()
                .max(Integer::compare)
                .orElse(Integer.MIN_VALUE);

        System.out.println("The maximum element : " + maxNumber);
    }
}
