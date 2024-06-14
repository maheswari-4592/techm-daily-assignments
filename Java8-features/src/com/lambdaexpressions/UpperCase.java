package com.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class UpperCase 
{
    public static void main(String[] args) 
    {
        List<String> strings = Arrays.asList("Alice", "Bob", "Charlie");

        strings.forEach(str -> System.out.println(str.toUpperCase()));
    }
}
