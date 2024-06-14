package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersFilter 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(42);
        numbers.add(53);

        System.out.println("\nEven Numbers:");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
    }
}
